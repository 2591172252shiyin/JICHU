package 特种作战;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class player {

    private int blood=100;
    private boolean gun=true;

    private int xuan;



    public int getXuan() {
        return xuan;
    }

    public void setXuan(int xuan) {
        this.xuan = xuan;
    }

    public player() {
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood =this.blood-blood;
    }

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr;
    }

    private String dr;

    public void show(){
        List<String> a = new ArrayList<String>();
        a.add("哈");
        a.add("卡");
        a.add("时间");

        if (getXuan()==1){
            setDr(a.get(0));
            System.out.println("玩家信息：姓名："+getDr()+" \t血量："+getBlood()+"\t是否持枪："+gun);
        }else if(getXuan()==2){
           setDr(a.get(1));
            System.out.println("玩家信息：姓名："+getDr()+" \t血量："+getBlood()+"\t是否持枪："+gun);
        }else if (String.valueOf(getXuan())!=""){
            setDr(a.get(2));
            System.out.println("玩家信息：姓名："+getDr()+" \t血量："+getBlood()+"\t是否持枪："+gun);
        }




    }

}
