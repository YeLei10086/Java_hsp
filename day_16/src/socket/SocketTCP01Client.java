package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 叶磊
 * 客户端(字节流)
 */
public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        //思路：
        //1、连接服务器(ip、端口)
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端已启动...");
        //2、连接上后,生成 Socket,通过 socket.getOutputStream() 得到和 socket对象相关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        //3、通过输出流,写入数据到数据管道
        outputStream.write("hello,server!".getBytes());
        //设置结束标记
        socket.shutdownOutput();
        //4、获取socket相关联的输出流
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readLen));
        }
        //5、关闭流对象和socket,必须关闭
        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端已退出...");
    }
}
