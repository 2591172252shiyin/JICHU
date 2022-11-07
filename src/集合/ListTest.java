package 集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List li = new ArrayList();
        li.add("户籍卡");
        li.add("ka");
        li.add("dak");

        //迭代器便历
        Iterator it = li.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //foreach遍历
        for (Object o : li) {
            System.out.println(o);
        }

        //索引遍历
        for (int i=0;i<li.size();i++){
            System.out.println(li.get(i));
        }




    }
}
