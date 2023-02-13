package outputstream_;

import java.io.*;

/**
 * @author 叶磊
 * 演示 BufferedInputStream 和 BufferedOutputStream 的使用
 */
public class BufferedCopy_ {
    public static void main(String[] args) {
        //需要拷贝的文件路径
        String srcPath = "D:\\迅雷下载\\bg.png";
        //拷贝到什么位置的文件路径
        String destPath = "D:\\迅雷下载\\bg2.png";
        //创建 BufferedInputStream 对象
        BufferedInputStream bufferedInputStream = null;
        //创建 BufferedOutputStream 对象
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //将复制的文件路径加入
            bufferedInputStream = new BufferedInputStream(new FileInputStream(srcPath));
            //将文件路径加入
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destPath));
            //创建字节数组
            byte[] bytes = new byte[1024];
            //读取的长度
            int readDate;
            //边读边写,直到-1
            while ((readDate = bufferedInputStream.read(bytes)) != -1){
                bufferedOutputStream.write(bytes,0,readDate);
            }
            System.out.println("拷贝成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //释放资源,关闭流
                if (bufferedInputStream != null){
                    bufferedInputStream.close();
                }
                if (bufferedOutputStream != null){
                    bufferedOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
