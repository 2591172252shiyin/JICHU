package 通信练习.UDP练习;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDOjieshou {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(Integer.parseInt("12345"));
        while (true) {
            byte[] by = new byte[1024];
            DatagramPacket dp = new DatagramPacket(by, by.length);

            ds.receive(dp);
            System.out.println("数据是：" + new String(dp.getData(), 0, dp.getLength()));
        }
      //  ds.close();

    }
}
