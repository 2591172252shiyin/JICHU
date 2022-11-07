package com.text.lianxi.青青积分;

import java.text.SimpleDateFormat;
import java.util.*;

public class MenberDao {
    Scanner sc = new Scanner(System.in);
    List<Menber> list = new ArrayList<Menber>();
    Menber mb = new Menber();
    int xz; //选项

    /*菜单*/
    public void menu(){
        System.out.println("****欢迎进入青青网校会员商城****");
        System.out.println("1.注册 2.积分累计 3.积分兑换 4.积分查询 5.修改密码 6.退出");
        System.out.println("请输入你的选项：");
         xz = sc.nextInt();
    }

    /*开始方法*/
    public void start(){
        do {
            menu();
            switch (xz){
                case 1:
                    zuce();
                    break;
                case 2:
                    jifen();
                    break;
                case 3:
                    duihuan();
                    break;
                case 4:
                    cha();
                    break;
                case 5:
                    xiu();
                    break;
                case 6:
                default:
                    exit();
                    break;
            }
        } while (true);
    }

    /*注册*/
    public void zuce(){
        System.out.println("请输入你的姓名");
        mb.setName(sc.next());

        mb.setId(this.suiji());

        System.out.println("请输入你的账号");
        String pwd;
        boolean flag =true;

        //限制密码
        do {
            pwd=sc.next();
            if (pwd.length()<4){
                System.out.println("账号长度不能小于4位");
                flag=false;
            }else {
                flag=true;
                mb.setPass(pwd);
            }
        }while (!flag);

        //赠送一百积分
        mb.setScore(100);

        //日期
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str = s.format(d);
        mb.setData(str);

        //输出信息
        System.out.println("注册成功，赠送100积分！你的编号是："+mb.getId()+"\t注册日期是："+mb.getData());


    }

    /*随机数*/
    public int suiji(){
        Random ran = new Random();
        int i = ran.nextInt(999999);
        for (Menber menber : list) {
            if (mb.getId()==i){
                i=ran.nextInt(999999);
            }
        }
        return i;
    }

    /*判断账号是否存在*/
    public Menber hasmenber(Menber mb) {
        if (mb.getPass() != null) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getPass() == mb.getPass()&&list.get(i).getPass().equals(mb.getPass())) {
                    System.out.print("该账号已存在");
                   return list.get(i);
                }
            }
        }else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getPass() == mb.getPass()) {
                    return list.get(i);
                }
            }
        }
        return null;
    }

    /*积分累计*/
    public void jifen(){
        boolean flag=true;
        do {
            System.out.println("请输入你的账号");
            String id= sc.next();
            if (id==mb.getPass()||id.equals(mb.getPass())){
                System.out.println("请输入消费金额 1元=1积分");
                mb.setScore(sc.nextInt()+mb.getScore());
              //  System.out.println(mb.getScore());
                flag=true;
            }else{
                System.out.println("你输入的账号有误，请重新输入");
                flag=false;
            }
        } while (!true);
    }

    /*积分兑换*/
    public void duihuan(){
        boolean flag=true;
        do {
            System.out.println("请输入你的账号");
            String id= sc.next();
            if (id==mb.getPass()||id.equals(mb.getPass())){
                System.out.println("你当前的积分是："+mb.getScore());
                System.out.println("请输入你要兑换的积分 100积分兑换1点QB（积分不足100不可用）");
                int jf = sc.nextInt();
                if (jf<100){
                    System.out.println("兑换的积分不能小于100");
                    flag=false;
                }else if (jf<mb.getScore()){
                    mb.setScore(mb.getScore()-jf);
                    System.out.println("你兑换了"+(jf/100)+"QB");
                    flag=true;
                }else{
                    System.out.println("你的积分不足");
                    flag=true;
                }
            }else {
                System.out.println("你输入的账号有误，请重新输入");
                flag=false;
            }
        } while (!flag);
    }

    /*账号查询*/
    public void cha(){
        boolean flag=true;
        do {
            System.out.println("请输入账号");
            String id = sc.next();
            if (id==mb.getPass()||id.equals(mb.getPass())){
                System.out.println("你的姓名是："+mb.getName()+"\t你的会员编号是："+mb.getId()+"\t你的账号是："+mb.getPass()+"\t你的积分："+mb.getScore()+"\t注册日期是："+mb.getData());
                flag=true;
            }else  {
                System.out.println("你输入的账号有误，请重新输入");
                flag=true;
            }
        } while (!flag);
    }

    /*修改密码*/
    public void xiu(){
        boolean sb =true;
        do {
            System.out.println("请输入你的账号");
            String id = sc.next();
            if (id==mb.getPass()||id.equals(mb.getPass())) {
                System.out.println("请输入新账号");
                String pwd;
                boolean flag = true;
                //限制密码
                do {
                    pwd = sc.next();
                    if (pwd.length() < 4) {
                        System.out.println("账号长度不能小于4位");
                        flag = false;
                    } else {
                        flag = true;
                        mb.setPass(pwd);
                        sb=true;
                        System.out.println("输入正确");
                    }
                } while (!flag);
            }else  {
                System.out.println("你输入的账号有误，请重新输入");
                sb=false;
            }
        } while (!sb);
    }

    /*退出*/
    public void exit(){
        System.exit(0);
    }
}
