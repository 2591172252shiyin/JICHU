package 继承;
                //继承的关键字
public class song extends father {
    public  String name="大聪明";
    public int aa=50;

      @Override //检验继承方法是否错误
    public  void show(){
        int aa = 0;
        System.out.println(aa);
        //访问当前类的变量
        System.out.println(this.aa);
        //访问父类的变量
        System.out.println(super.aa);



        System.out.println(name);
        System.out.println(sex);
        System.out.println("这是子类");


    }



}
