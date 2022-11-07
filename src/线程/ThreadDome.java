package 线程;
            //  Thread.currentThread().
public class ThreadDome {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        m1.setName("炮");
        m2.setName("梅");

        //  更改线程的优先级 依旧具有随机性
        //  m2.setPriority(Thread.MAX_PRIORITY);
        //  m1.setPriority(Thread.MIN_PRIORITY);
        //    获取当前线程的默认值
        //  System.out.println(m1.getPriority());


        //join  调用当前方法的执行完 其他的继续执行
        m1.start();
//        try {
//            m1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        //守护线程
        m2.setDaemon(true);  //主线程结束 守护线程也结束
        m2.start();
    }
}
