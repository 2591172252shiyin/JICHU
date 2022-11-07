package Io流;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {

    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\等会删\\file 文件流\\java.txt");
              //创建一个新的文件
        System.out.println(f1.createNewFile());

        //创建一个新的文件夹
        File f2 = new File("D:\\等会删\\file 文件流\\javaSE.txt");
        System.out.println(f2.mkdir());

        //创建一个多级目录
        File f3 = new File("D:\\等会删\\file 文件流\\javaSE\\JAVAEE");
        System.out.println(f3.mkdirs());

        //删除当前文件
        File f4 = new File("D:\\等会删\\file 文件流\\java.txt");
        System.out.println(f4.delete());
    }
}
