package outputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 叶磊
 */
public class FileOutputStrem_ {
    public static void main(String[] args) {

    }

    /**
     * 1、new FileOutputStream(filePath)创建方式,当写入内容时,会将原来的内容覆盖
     * 2、new FileOutputStream(filePath,true)创建方式,当写入内容时,会追加到原来内容的后面,不会进行覆盖
     */
    @Test
    public void writeFile01(){
        //创建一个文件路径
        String filePath = "D:\\迅雷下载\\a.txt";
        //创建一个fileOutputStream 对象
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePath);
            //写入一个字节
//            fileOutputStream.write('H');
            //写入字符串
            String str = "hello!";
            //getBytes() 可以把字符串 --> 字节数组
//            fileOutputStream.write(str.getBytes());
            //指定写入字符串长度
            //write(byte b[], int off, int len)
//            fileOutputStream.write(str.getBytes(),0,str.length());
            fileOutputStream.write(str.getBytes(),0,3);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void writeFile02(){
        //创建一个文件路径
        String filePath = "D:\\迅雷下载\\a.txt";
        //创建一个fileOutputStream 对象
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePath,true);
            //写入一个字节
//            fileOutputStream.write('H');
            //写入字符串
            String str = "pangpangyu";
            //getBytes() 可以把字符串 --> 字节数组
//            fileOutputStream.write(str.getBytes());
            //指定写入字符串长度
            //write(byte b[], int off, int len)
//            fileOutputStream.write(str.getBytes(),0,str.length());
            fileOutputStream.write(str.getBytes(),0,4);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
