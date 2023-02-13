package homework.homework02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author 叶磊
 */
public class ReceiverA {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        System.out.println("接收端 8888 正在监听消息...");
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        datagramSocket.receive(packet);

        byte[] data = packet.getData();
        int length = packet.getLength();
        String s = new String(data, 0, length);
        String answer = "";
        if ("四大名著是哪些?".equals(s)) {
            answer = "三国、水浒、西游戏、红楼梦";
        }else {
            answer = "waht？";
        }

        bytes = answer.getBytes();
        packet = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.159.1"),8889);
        datagramSocket.send(packet);

        datagramSocket.close();
    }
}
