package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class test {
    public static void main(String[] args) throws Exception{
        //获取Person的对象
        Class ps = Person.class;

        //获取构造函数  所有的
        Constructor[] cns = ps.getDeclaredConstructors();
        for (Constructor cn : cns) {
            System.out.println(cn);
        }
        System.out.println("---------");
        //获取成员变量
        Field[] f = ps.getFields(); //只能获取到public修饰的成员变量
        for (Field fd : f){
            System.out.println(fd);
        }
        System.out.println("---------");

        //获取Person中name的值
        Field name = ps.getField("name");
        Person p = new Person();
        Object  o = name.get(p);
        System.out.println(o);
        //给name赋值
        name.set(p,"去年没");
        System.out.println(p);

        System.out.println("----------");
        //获取所有的成员变量，不考虑修饰符
        Field[] fd1 = ps.getDeclaredFields();

        for (Field fi: fd1) {
            System.out.println(fi);
        }


    }
}
