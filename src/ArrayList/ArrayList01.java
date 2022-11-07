package ArrayList;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("诗音");
        al.add("帅比");
           //在指定位置插入内容
        al.add(1,"炮");
          //remove 删除指定的内容
        // System.out.println(al.remove("sb"));
          //remove 删除指定索引的内容  返回被删除的内容
        //System.out.println(al.remove(0));
          //set 修改指定索引的内容 返回被修改的内容
       // System.out.println(al.set(0,"诗音"));
          //get 查找指定索引的内容
       // System.out.println(al.get(0));
          //size 返回集合的个数
       // System.out.println(al.size());

       for (int i = 0;i<al.size();i++){
           String s = al.get(i);
           System.out.println(s);
       }


        System.out.println(al);
    }
}
