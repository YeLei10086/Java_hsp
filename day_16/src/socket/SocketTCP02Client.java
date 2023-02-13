package socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 叶磊
 * 客户端(字符流)
 */
public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        //思路：
        //1、连接服务器(ip、端口)
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端已启动...");
        //2、连接上后,生成 Socket,通过 socket.getOutputStream() 得到和 socket对象相关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        //3、通过输出流,写入数据到数据管道
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        bw.write("hello,server!");
        bw.newLine();   //插入一个换行符,表示回复内容结束,这里使用了newLine,接收方必须使用readLine();
        bw.flush(); //字符流必须使用刷新,否则写不进
        //4、获取socket相关联的输出流
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String line = br.readLine();
        System.out.println(line);
        //5、关闭流对象和socket,必须关闭
        br.close();
        bw.close();
        socket.close();
        System.out.println("客户端已退出...");
    }
}
