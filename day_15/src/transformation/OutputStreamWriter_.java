package transformation;

import java.io.*;

/**
 * @author 叶磊
 * OutputStreamWriter 使用
 * 把 FileOutputStream 字节流,转换成字符流 OutputStreamWriter
 * 指定写入字符的编码格式  gbk/utf-8/utf8
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\迅雷下载\\乱码test2.txt";
        String charSet = "utf8";
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), charSet));
        String str = "贺驰宇是个猪头";
        bufferedWriter.write(str);
        bufferedWriter.newLine();

        bufferedWriter.close();
        System.out.println("按照这种编码方式 " + charSet + " 写入成功！");
    }
}
