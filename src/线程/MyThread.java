package 线程;

import jdk.nashorn.internal.ir.Block;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    //lock 锁
    private Lock lock = new ReentrantLock();
    //加锁
   // lock.lock();
    //释放锁
     //lock.unlock();

    @Override
    public void run() {
        for (int i=0;i<100;i++){

            System.out.println(getName()+":"+i);
//            //sleep 睡眠方法
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

           //  代码锁 synchronized ()
        }
    }
}
