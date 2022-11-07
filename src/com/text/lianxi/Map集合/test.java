package com.text.lianxi.Map集合;

import groovy.transform.ToString;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Map<String,String> mp = new HashMap();
        mp.put("Ru","俄罗斯");
        mp.put("CN","中国");
        mp.put("US","美国");

        System.out.println("国家的总和是"+mp.size());

        //简称找全称
        String cn =mp.get("CN");
        System.out.println(cn);


        for (String s : mp.keySet()) {
            String s1 = mp.get(s);
            System.out.println(s+"-----"+s1);
        }
        System.out.println("----------");
          //遍历键值对
        for (Map.Entry<String, String> s : mp.entrySet()) {
                System.out.println(s);
            }
        //清空所有
              mp.clear();
        System.out.println("----------");
        System.out.println(mp);

    }
}
