package com.text.lianxi.第一章实战训练;

import java.util.Scanner;

public class AppleTree {
    //定义生长状态
     public class zhuangtai{
        public static final String birty="生长期";
        public static final String zj="成熟期";
        public static final String dead="已死亡";
    }
     public class appletree{
         //能在控制台选择想种的品种
         //名称，品种，生长期时长，采摘期时长，果实数量，生长状态，是否一采摘
          private String name="苹果树";//名字
          private String pinzhong; //品种
          private int sztime=10; //生长时期
          private int cztime=8; //采摘时期
          private int guoshi=50; //果实数量


          private String szzt="还在生长"; //生长状态
          private boolean yesno=false; //是否采摘

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         public String getPinzhong() {
             return pinzhong;
         }

         public void setPinzhong(String pinzhong) {
             this.pinzhong = pinzhong;
         }

         public int getSztime() {
             return sztime;
         }

         public void setSztime(int sztime) {
             this.sztime = sztime;
         }

         public int getCztime() {
             return cztime;
         }

         public void setCztime(int cztime) {
             this.cztime = cztime;
         }

         public int getGuoshi() {
             return guoshi;
         }

         public void setGuoshi(int guoshi) {
             this.guoshi = guoshi;
         }

         public String getSzzt() {
             return szzt;
         }

         public void setSzzt(String szzt) {
             this.szzt = szzt;
         }

         public boolean isYesno() {
             return yesno;
         }

         public void setYesno(boolean yesno) {
             this.yesno = yesno;
         }
     }
     public class yumi{
         //名称，生长期时长，采摘期时长，果实数量，生长状态，收割费用，是否一采摘
         public String name="玉米";
         public int sztime=15;
         public int cztime=10;
         public int guoshi=2;
         public String szzt="生长期";
         public int shouge=50;
         public boolean yesno=false;
         public int setShouge;

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         public int getSztime() {
             return sztime;
         }

         public void setSztime(int sztime) {
             this.sztime = sztime;
         }

         public int getCztime() {
             return cztime;
         }

         public void setCztime(int cztime) {
             this.cztime = cztime;
         }

         public int getGuoshi() {
             return guoshi;
         }

         public void setGuoshi(int guoshi) {
             this.guoshi = guoshi;
         }

         public String getSzzt() {
             return szzt;
         }

         public void setSzzt(String szzt) {
             this.szzt = szzt;
         }

         public int getShouge() {
             return shouge;
         }

         public void setShouge(int shouge) {
             this.shouge = shouge;
         }

         public boolean isYesno() {
             return yesno;
         }

         public void setYesno(boolean yesno) {
             this.yesno = yesno;
         }
     }

    public void show(){
         //选择要中的作物 苹果，玉米    如果中苹果 输入苹果的品种，如果种玉米 输入玉米的收割机
         //在控制台输出特性，名称 生长期时长，采摘期时长，果实数量  苹果品种 收割机类型
         //1.种植  2.查看生长状态 3.收获果实 4. 退出
         Scanner input = new Scanner(System.in);
         int type = 0;//选择要种的东西
         int ty=0;//品种
         int day=0;//默认作物生长时间是0
        appletree aa = new appletree();
        yumi ym=new yumi();
         System.out.println("-----------欢迎回家--------");
         do{
         System.out.println("--------星沫生态农场--------");
         System.out.println("请选择你要做的事 1.种植  2.查看生长状态 3.收获果实 4. 退出");
         int zhong=input.nextInt();//录入要执行的操作
         switch (zhong){
             case 1:
                 System.out.println("请选择你要种植的作物1.苹果   2.玉米");
                  type= input.nextInt();
                 switch (type){
                     case 1:
                         appletree at = new appletree();
                         System.out.println("请输入你要种的苹果品种 1.富士康  2.大帅");
                         ty=input.nextInt();
//                         switch (ty){
//                             case 1:
//                                 System.out.println("你种的是富士康的苹果");
//                                 break;
//                             case 2:
//                                 System.out.println("你种的是大帅苹果");
//                                 break;
//                         }
                         if (ty==1){
                             System.out.println("你种的是富士康苹果，生长周期是"+at.getSztime()+"天，采摘周期是"+at.getCztime()+"天,果实有"+at.getGuoshi()+"个");
                         }else if(ty==2){
                             System.out.println("你种的是大帅苹果，生长周期是"+at.getSztime()+"天，采摘周期是"+at.getCztime()+"天,果实有"+at.getGuoshi()+"个");
                         }
                         break;

                     case 2:

                         System.out.println("请选择你要使用的收割机类型  1.家用收割机50元  2.联合收割机150元");
                         ty=input.nextInt();
//                         switch (ty){
//                             case 1:
//                                 System.out.println("你选择的是家用收割机50元");
//                                 break;
//                             case 2:
//                                 System.out.println("你选择的是联合收割机150元");
//                                 ym.setShouge=150;
//                                 break;
//                         }
                         if (ty==1){
                             System.out.println("你种的是玉米，生长周期是"+ym.getSztime()+"天，采摘周期是"+ym.getCztime()+"天，果实数量是"+ym.getGuoshi()+"个，收割机用的是家用收割机50元");
                         }else if(ty==2){
                             System.out.println("你种的是玉米，生长周期是"+ym.getSztime()+"天，采摘周期是"+ym.getCztime()+"天，果实数量是"+ym.getGuoshi()+"个，收割机用的是联合收割机150元");
                         }
                         break;
                 }
                 break; //1.种植 结束

             case 2:  //查看生长状态
                 if (type==1){ //苹果的生长状态
                     System.out.println("请输入你的作物生长时间");

                     day =input.nextInt();
                     if (day>= aa.getCztime()+ aa.getSztime()){
                         aa.setSzzt("已死亡");
                         System.out.println(aa.name+"处于"+aa.getSzzt());
                         System.out.println("请尽快处理土地");
                     }else if (day> aa.getSztime()){
                         aa.setSzzt("成熟期");
                         System.out.println(aa.name+"处于"+aa.getSzzt());
                         if (!aa.yesno){
                             System.out.println("请尽快采摘");
                         }else{
                             System.out.println("果实已采摘完毕");
                         }
                     }else{
                        aa.setSzzt("生长期");
                         System.out.println(aa.name+"处于"+aa.getSzzt());
                         System.out.println("已生长"+day+"天，距成熟还有"+(aa.sztime-day)+"天");
                     }

                 }else if (type==2){ //玉米的生长状态
                     System.out.println("请输入你的作物生长时间");
                     day=input.nextInt();

                     if (day>=ym.getSztime()+ym.getCztime()){
                         ym.setSzzt("已死亡");
                         System.out.println(ym.name+"已死亡，请尽快处理土地");
                     }else if (day>=ym.getSztime()){
                         ym.setSzzt("成熟期");
                         System.out.println(ym.name+"处于"+ym.getSzzt());
                         if (!ym.yesno){
                             System.out.println("果实已成熟，请尽快采摘");
                         }else{
                             System.out.println("果实已采摘完成");
                         }
                     }else {
                        ym.setSzzt("生长期");
                         System.out.println(ym.name+"处于"+ym.getSzzt());
                         System.out.println("已生长"+day+"天，距成熟还有"+(ym.sztime-day)+"天");
                     }
                              //玉米生长状态结束
                 }else{      //不种东西
                     System.out.println("请选择你要种的作物");

                 }
                 break; //2.生长状态结束

             case 3:       //收获果实
                 if (type==1){  //收获苹果
                     if (aa.getSzzt().equals(zhuangtai.zj)){ //成熟期才能摘
                         if(!aa.yesno){
                             System.out.println("收获了"+aa.guoshi+"个苹果");
                            aa.yesno=true;
                         }else  {
                             System.out.println("果实已采摘");
                         }
                     }else  {
                         System.out.println("只有在成熟期才能摘");

                     }
                 }else if(type==2){

                     if (ym.getSzzt()==zhuangtai.zj){
                         if (!ym.yesno) {
                             System.out.println("收获了" + ym.guoshi + "根玉米");
                             ym.yesno = true;
                         }else{
                             System.out.println("果实已采摘");
                         }
                     }else {
                         System.out.println("只有在成熟期才能摘");
                     }
                 }else{      //不种东西
                     System.out.println("请选择你要种的作物");
                 }
                 break;

             case 4:
                 System.out.println("已退出星沫生态农场");
                 return;
             default:
                 System.out.println("你输的不对，重新！！！！");

         }
         }while (true);

  }









}
