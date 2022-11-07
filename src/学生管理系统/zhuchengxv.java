package 学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class zhuchengxv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> al = new ArrayList<>();

        while(true) {
            System.out.println("-----欢迎来到管理系统-----");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出程序");
            System.out.println("请输入你的选项");

            String s = sc.next();

            switch (s) {
                case "1":
                     tianjia(al);
                    break;
                case "2":
                     shan(al);
                    break;
                case "3":
                     updata(al);
                    break;
                case "4":
                    chakan(al);
                    break;
                case "5":
                    System.out.println("感谢使用");
                    //break;
                    System.exit(0);//jvm java虚拟机退出

            }
        }

    }

    public static void tianjia(ArrayList<Student> al){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号");
        String sid = sc.next();
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("请输入地址");
        String address = sc.next();

        Student stu = new Student();
        stu.setSid(sid);
        stu.setName(name);
        stu.setAge(age);
        stu.setAddress(address);
        al.add(stu);

        System.out.println("添加成功");



    }

    public static void chakan(ArrayList<Student> al){
        if (al.size()==0){
            System.out.println("没有东西，你看个屁");
        }else {

            System.out.println("学号   姓名   年龄   地址");

            for (int i =0;i<al.size();i++){
                Student s = al.get(i);
                System.out.println(s.getSid()+"\t   "+s.getName()+"\t "+s.getAge()+"\t  "+s.getAddress());
            }
        }

    }

    public static void shan(ArrayList<Student> al){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要删除的学生学号");
        String sid = sc.next();
        for (int i = 0 ; i<al.size();i++) {
            Student s = al.get(i);
            if (s.getSid().equals(sid)){
                al.remove(i);
                break;
            }
        }
        System.out.println("删除成功");

    }

    public static void updata(ArrayList<Student> al){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生学号");
        String sid = sc.next();
        for (int i=0;i<al.size();i++){
            Student s = al.get(i);
            if (s.getSid().equals(sid)){
                System.out.println("输入新的学号");
                String id = sc.next();
                if (id.equals(s.getSid())){
                    System.out.println("你输入的学号重复了！！！！！");
                    System.out.println("输入新的学号");
                    String id1 = sc.next();
                    s.setSid(id1);
                    System.out.println("请输入新名字");
                    String name = sc.next();
                    System.out.println("请输入新年龄");
                    int age = sc.nextInt();
                    System.out.println("请输入新地址");
                    String address = sc.next();
                    s.setName(name);
                    s.setAge(age);
                    s.setAddress(address);
                }else  {
                    System.out.println("请输入新名字");
                    String name = sc.next();
                    System.out.println("请输入新年龄");
                    int age = sc.nextInt();
                    System.out.println("请输入新地址");
                    String address = sc.next();
                    s.setSid(id);
                    s.setName(name);
                    s.setAge(age);
                    s.setAddress(address);

                }

                System.out.println("修改成功");
            }else{
                System.out.println("学号错了傻蛋");
            }
        }




    }

}
