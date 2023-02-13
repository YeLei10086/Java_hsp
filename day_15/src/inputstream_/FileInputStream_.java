package inputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 叶磊
 */

public class FileInputStream_ {
    public static void main(String[] args) {

    }

    /**
     * 演示读取文件
     * 单个字节读取,效率比较低 -> 使用read(byte[] b)读取
     */
    @Test
    public void readFile01() {
        String filePath = "D:\\迅雷下载\\hello.txt";    //要读取的文件路径
        FileInputStream fileInputStream = null; //创建一个字节流对象,用于读取文件
        int readDate = 0;   //读取字节
        try {
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取一个字节的数据. 如果没有输入可用,此方法将阻止。
            //如果返回 -1,表示读取完毕,否则直到文件读完
            while ((readDate = fileInputStream.read()) != -1){
                System.out.print((char) readDate);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();    //避免资源浪费,关闭文件流
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 使用read(byte[] byte) 高效读取
     */
    @Test
    public void readFile02() {
        String filePath = "D:\\迅雷下载\\hello.txt";    //要读取的文件路径
        FileInputStream fileInputStream = null; //创建一个字节流对象,用于读取文件
        byte[] bytes = new byte[8]; //每次读取8个字节,如果不足8个字节,返回对应的字节数
        int readLenth = 0;
        try {
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取最多b.length字节的数据到字节数组。 此方法将阻塞，直到某些输入可用,否则不会读取
            //如果返回 -1,表示读取完毕
            //如果读取正常,返回实际读取的字节数
            while ((readLenth = fileInputStream.read(bytes)) != -1) {
                System.out.print(new String(bytes,0,readLenth));    //显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();    //避免资源浪费,关闭文件流
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
