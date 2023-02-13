package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 叶磊
 * 服务端(字节流)
 */
public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        //思路：
        //1、在本机的 9999 端口监听,等待连接(前提：没有其他服务占用9999端口)
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器端口 9999 正在监听中...");
        //2、当没有客户端连接 9999 端口时,程序会处于阻塞状态,等待连接
        //如果有客户端连接,则会返回一个 Socket 对象,程序执行
        //细节：这个 ServerSocket 可以通过 accept(),返回多个Socket【多个客户端 连接一个服务器的并发】
        Socket socket = serverSocket.accept();
        //3、通过 socket.getInputStream() 读取,客户端写入到数据通道的数据,显示
        InputStream inputStream = socket.getInputStream();
        //4、IO读取
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readLen));
        }
        //5、获取socket相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,client!".getBytes());
        //设置结束标记
        socket.shutdownOutput();
        //6、关闭流、socket和serverSocket
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务器已退出...");
    }
}
