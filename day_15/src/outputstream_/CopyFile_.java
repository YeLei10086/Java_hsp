package outputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 叶磊
 */
public class CopyFile_ {
    public static void main(String[] args) {

    }

    @Test
    public void copy01(){
        //想复制的文件路径
        String strPath = "D:\\UpupooResource\\2000035486\\bg.png";
        //复制到某个目标的路径
        String destPath = "D:\\迅雷下载\\bg.png";
        //创建字节输入流对象
        FileInputStream fileInputStream = null;
        //创建字节输出流对象
        FileOutputStream fileOutputStream = null;
        try {
            //将路径加入输入流中
            fileInputStream = new FileInputStream(strPath);
            //将路径加入输出流
            fileOutputStream = new FileOutputStream(destPath);
            //创建字节数组
            byte[] buf = new byte[1024];
            int readLen = 0;    //读取的长度
            while ((readLen = fileInputStream.read(buf)) != -1){
                //边读边写,直到-1
                fileOutputStream.write(buf,0,readLen);  //一定要使用这种写出方法
            }
            System.out.println("拷贝成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //释放资源,关闭输入输出流
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
