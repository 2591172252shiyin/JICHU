package String和StringBuilder;
import java.util.Scanner;
public class StringAndStringBuilder {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);

        //StringBuilder 的两种方法
//       StringBuilder sb = new StringBuilder();
            //插入内容
////       sb.append("hello");
////       sb.append("java");
//          //链式编程
//       sb.append("套娃").append(" 好快乐").append(100);
//       //String s = sb.toString(); StringBuilder 转换String
//
//        System.out.println(sb);
//        //反转方法
//        sb.reverse();
//        System.out.println(sb);

        //StringBuilder 和 String 之间的类型转换
        StringBuilder sb = new StringBuilder();
        sb.append("你好");
        String s = sb.toString(); //StringBuilder 转 String
        System.out.println(s);

        String a = "呜啦啦";
        StringBuilder sb1 = new StringBuilder(a); //String 转 StringBuilder
        System.out.println(sb1);


    }
}
