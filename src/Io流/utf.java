package Io流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class utf {
    public static void main(String[] args) throws IOException {
        String s = "新的方式";
        byte[] by = s.getBytes("UTF-8");
        System.out.println(Arrays.toString(by));

        String ss = new String(by);
        System.out.println(ss);



//        FileOutputStream fos = new FileOutputStream("D:\\等会删\\utf-8.txt");
//       fos.write(51);
//       fos.close();
    }
}
