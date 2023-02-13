package upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 叶磊
 */
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
        //客户端连接服务端端口,得到socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端已启动！");
        //创建读取磁盘文件的输入流
        String imgPath = "D:\\迅雷下载\\bg.png";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(imgPath));
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //通过socket获取输入流,将bytes数据发送给服务端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        //将文件对应的字节数组的内容,写入到数据通道
        bos.write(bytes);
        bis.close();
        //设置写入数据的结束标记
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        String string = StreamUtils.streamToString(inputStream);
        System.out.println(string);

        //关闭相关流
        inputStream.close();
        bos.close();
        socket.close();
    }
}
