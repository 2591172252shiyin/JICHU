package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class test01 {
    public static void main(String[] args) throws Exception {
        Class pl = Person.class;

        Constructor con = pl.getConstructor(String.class, int.class);
        System.out.println(con);
        //赋值
        Object obj = con.newInstance("张三", 20);
        System.out.println(obj);
    }
}
