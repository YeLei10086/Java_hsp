package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 叶磊
 * 服务端(字符流)
 */
public class SocketTCP02Server {
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
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String line = br.readLine();
        System.out.println(line);
        //5、获取socket相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        bw.write("hello,client！");
        bw.newLine();   //插入一个换行符,表示回复内容结束,这里使用了newLine,接收方必须使用readLine();
        bw.flush(); //字符流必须使用刷新,否则写不进
        //6、关闭流、socket和serverSocket
        bw.close();
        br.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务器已退出...");
    }
}
