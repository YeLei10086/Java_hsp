package homework.homework03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 叶磊
 */
public class TCPFileDownloadServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端已启动...");
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
//        String downLoadFileName = upload.StreamUtils.streamToString(inputStream);
        byte[] buf = new byte[1024];
        int readLen = 0;
        String downLoadFileName = "";
        while ((readLen = inputStream.read(buf)) != -1){
            downLoadFileName = new String(buf, 0, readLen);
        }
        System.out.println(downLoadFileName);
        String resFileName = "";
        if ("高山流水".equals(downLoadFileName))
        {
            resFileName = "day_16\\src\\高山流水.mp3";
        }else {
            resFileName = "day_16\\src\\无名.mp3";
        }

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(resFileName));
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bis.close();
        socket.shutdownOutput();

        bos.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
