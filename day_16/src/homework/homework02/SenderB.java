package homework.homework02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author 叶磊
 */
public class SenderB {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DatagramSocket datagramSocket = new DatagramSocket(8889);
        System.out.println("发送端 8889 已启动...");
        System.out.println("请输入你的问题：");
        String question = sc.next();
        byte[] data = question.getBytes();
        DatagramPacket packet = new DatagramPacket(data,0, data.length, InetAddress.getByName("192.168.159.1"),8888);
        datagramSocket.send(packet);

        byte[] bytes = new byte[1024];
        packet = new DatagramPacket(bytes, bytes.length);
        datagramSocket.receive(packet);

        data = packet.getData();
        int length = packet.getLength();
        String s = new String(data, 0, length);
        System.out.println(s);

        datagramSocket.close();
    }
}
