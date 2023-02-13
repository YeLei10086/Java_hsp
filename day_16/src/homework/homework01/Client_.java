package homework.homework01;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 叶磊
 */
public class Client_ {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端已启动");
        System.out.println("请输入想发送的内容：");
        String question = sc.next();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(question);
        bw.newLine();
        bw.flush();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();
        System.out.println(line);

        bw.close();
        br.close();
        socket.close();
    }
}
