package 特种作战;

import sun.font.TrueTypeFont;

import java.io.ObjectInputStream;
import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        player pl = new player();
      Scanner sc = new Scanner(System.in);

        String name; //玩家名字
        int blood=100;
        boolean gun=true;
        int wj=0; //选择玩家
        int mydj=30;//我的弹夹
        int hisdj=30;//敌人的弹夹

        System.out.println("战前准备");
        System.out.println("请输入玩家姓名:");
        name = sc.next();
        System.out.println("请选择对战玩家 1.哈 2.卡 3.时间");
        wj = sc.nextInt();
        pl.setXuan(wj);
        System.out.println("玩家信息：姓名："+name+" \t血量："+blood+"\t是否持枪："+gun);
        pl.show();

        //对战代码
       int hh=1;//回合数
      do {
        Random ra = new Random();
        int mysy =ra.nextInt(40);
        int hissy=ra.nextInt(40);
         System.out.println("第"+hh+"回合");
         hh++;
         System.out.println(name+"向"+pl.getDr()+"开了一枪");
         mydj--;
           System.out.println("弹夹状态"+mydj);
          pl.setBlood(hissy);
           //他打我
           System.out.println(pl.getDr()+"向"+name+"开了一枪");
           hisdj--;
           System.out.println("弹夹状态"+hisdj);
           blood=blood-mysy;
          // pl.getBlood();//得到敌人受攻击之后

          //展示状态
          if (pl.getBlood()>=1&&blood>=1){
              System.out.println("玩家信息：姓名："+name+" \t血量："+blood+"\t是否持枪："+gun);
              pl.show();

          }else{
              if (blood<=0){
                  blood=0;
                  System.out.println("玩家信息：姓名："+name+" \t血量："+blood+"\t是否持枪："+gun);
                  System.out.println("玩家"+name+"死亡");
              }else{
                  pl.setBlood(0);
                  pl.show();
                  System.out.println("玩家"+pl.getDr()+"死亡");
              }

              System.out.println("血槽空了，bye~");
              return;
          }
             if (mydj==0||hisdj==0){
                 System.out.println("弹夹空了");
                 return;
             }

      }while (true);






    }
}
