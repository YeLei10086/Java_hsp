package homework.homework03;

import upload.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 叶磊
 */
public class TCPFileDownloadClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        System.out.println("客户端已启动...");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想下载的资源：");
        String question = sc.next();
        bw.write(question);
        bw.flush();
        socket.shutdownOutput();

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //将得到的bytes数组，写入到指定的路径,就得到一个文件了
        String destPath = "D:\\迅雷下载\\" + question + ".mp3";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath));
        bos.write(bytes);

        bos.close();
        bis.close();
        bw.close();
        socket.close();
    }
}
