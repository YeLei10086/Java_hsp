package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author 叶磊
 * 接收端
 */
public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //1、创建一个 DatagramSocket 对象,准备在9999端口接收数据
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        //2、构建一个 DatagramPacket 对象,准备接收数据
        //UDP协议，一个数据包最大为64k
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        //3、调用 接收方法,将通过网络传输的 packet 对象
        //  填充到 packet 对象
        //细节：如果有数据包发送到9999端口时，就会接收到数据
        //      如果没有数据包发送到9999端口时,就会处于阻塞等待
        System.out.println("接收端A 等待接收数据中...");
        datagramSocket.receive(packet);

        //4、可以把 packet 进行拆包,取出数据,并显示
        byte[] data = packet.getData(); //接收到的数据
        int length = packet.getLength();    //实际接收到的数据字节长度
        String s = new String(data, 0, length);
        System.out.println(s);

        data = "行,晚上8.30上线~".getBytes();
        packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.159.1"), 9998);
        datagramSocket.send(packet);
        //关闭流
        datagramSocket.close();
        System.out.println("接收端已退出");
    }
}
