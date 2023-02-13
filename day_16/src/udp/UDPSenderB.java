package udp;

import java.io.IOException;
import java.net.*;

/**
 * @author 叶磊
 * 发送端
 */
public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        //1、创建 DatagramSocket 对象，准备在9998端口 接收数据
        DatagramSocket datagramSocket = new DatagramSocket(9998);
        //2、需要将发送的数据,封装到 DatagramPacket 对象
        byte[] data = "晚上打游戏~".getBytes();
        //3、说明：封装的 DatagramPacket 对象 data 内容字节数组,data.length，主机（IP）,端口
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.159.1"), 9999);
        datagramSocket.send(packet);

        byte[] bytes = new byte[1024];
        packet = new DatagramPacket(bytes,bytes.length);

        System.out.println("接收端B 等待接收数据中...");
        datagramSocket.receive(packet);

        data = packet.getData(); //接收到的数据
        int length = packet.getLength();    //实际接收到的数据字节长度
        String s = new java.lang.String(data, 0, length);
        System.out.println(s);

        //4、关闭资源
        datagramSocket.close();
        System.out.println("发送端已退出");
    }
}
