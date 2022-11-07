package 通信练习.UDP练习;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class UDPfashong {
    public static void main(String[] args) throws IOException {
        DatagramSocket dg = new DatagramSocket();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line=br.readLine())!=null){
            if ("886".equals(line)){
                break;
            }
            byte[] by = line.getBytes();
            DatagramPacket dp = new DatagramPacket(by,by.length, InetAddress.getByName("192.168.38.227"),12345);

            dg.send(dp);

        }
          dg.close();
    }
}
