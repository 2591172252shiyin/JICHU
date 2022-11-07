package Io流;

import java.io.File;
         //用递归查指定文件目录下的所有文件

public class allFile {
    public static void main(String[] args) {
        File fi = new File("D:\\等会删\\数据库");

            wenjian(fi);

    }
    //定义一个方法 用于获取指定目录下的所有文件
    public static void wenjian(File fi){
        File []arrfile = fi.listFiles();
        if (arrfile != null){
            for ( File file : arrfile){
                //判断是否是目录
                if (file.isDirectory()){
                    wenjian(file);
                }else{
                    //不是 获取绝对路径输出到控制台
                    System.out.println(file.getAbsolutePath());
                }
            }
        }



    }
}
