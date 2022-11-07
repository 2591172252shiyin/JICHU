package 内部类;

public class IN {
    public int a = 10;
    //内部类
    public class small{
        //内部类的方法
        public void show(){
            //内部类可以访问外部类的变量
            System.out.println(a);
            System.out.println("公开的内部类");
        }
    }
    private class small1{
        public void show1(){
            System.out.println("私有的内部类");
        }
    }


    public void nicai(){
        small1 a = new small1();
        a.show1();
    }
}
