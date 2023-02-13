package upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 叶磊
 */
public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {
        //服务端监听9999端口
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器已启动！");
        //等待连接
        Socket socket = serverSocket.accept();
        //读取客户端发送的数据
        //通过socket得到输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //将得到的bytes数组，写入到指定的路径,就得到一个文件了
        String destPath = "day_16\\src\\bg.png";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath));
        bos.write(bytes);
        bos.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("图片已收到！");
        bw.flush();
        socket.shutdownOutput();

        //关闭其他资源
        bw.close();
        bis.close();
        socket.close();
        serverSocket.close();
    }
}
