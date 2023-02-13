package homework.homework01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 叶磊
 */
public class Server_ {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端 正在监听9999端口");
        //接收数据
        Socket socket = serverSocket.accept();
        //创建数据管道
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //读取数据
        String line = br.readLine();
        String answer = "";
        if ("name".equals(line)){
            answer = "叶磊";
        }else if ("hobby".equals(line)){
            answer = "编写Java程序";
        } else {
            answer = "你说啥呢";
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(answer);
        bw.newLine();
        bw.flush();

        bw.close();
        br.close();
        socket.close();
        serverSocket.close();
    }
}
