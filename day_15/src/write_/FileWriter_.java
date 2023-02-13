package write_;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 叶磊
 */
public class FileWriter_ {
    public static void main(String[] args) {
        String filePath = "D:\\迅雷下载\\testWrite.txt";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            //写入单个字符
            fileWriter.write("H ");
            //写入指定字符数组
            char[] chars = {'我','的','猪','头'};
            fileWriter.write(chars);
            //write(char cbuf[], int off, int len) 写入指定数组的指定部分
            fileWriter.write(" 贺驰宇是个猪头".toCharArray(),0,4);
            //写入整个字符串
            fileWriter.write(" 贺驰宇是个猪头");
            //写入指定字符串的指定部分
            fileWriter.write(" 贺驰宇是个猪头",0,4);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //  FileWriter 一定要关闭流(close)
                //  或者 flush 才能真正的把数据写入到文件中
                /**
                 * 源码看原因 ：
                 *
                 */
                fileWriter.close();
                System.out.println("写入成功！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
