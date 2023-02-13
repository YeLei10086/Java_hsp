package transformation;

import java.io.*;

/**
 * @author 叶磊
 * 看一个中文乱码问题
 * 使用 InputStreamReader 转换流解决中文乱码问题
 * 将字节流 FileInputStream 转成字符流 InputStreamReader, 指定编码 gbk/utf-8
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\迅雷下载\\乱码test.txt";   //这个文件是gbk类型的
        //1、把 FileInputStream 转成 InputStreamReader
        //2、指定编码 gbk
        //3、把 InputStreamReader 传入 BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new java.io.InputStreamReader(new FileInputStream(filePath),"gbk"));
        //4、读取
        String s = bufferedReader.readLine();
        System.out.println("读取内容 = " + s);
        //5、关闭外层流
        bufferedReader.close();
        System.out.println("读取完毕！");
    }
}
