package write_;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author 叶磊
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws Exception {
        String filePath = "D:\\迅雷下载\\ok.txt";
        BufferedWriter bufferedWriter = null;
        bufferedWriter = new BufferedWriter(new FileWriter(filePath,true)); //开启追加模式
        bufferedWriter.write("贺驰宇是头猪！");
        bufferedWriter.newLine();   //插入一个和系统相关的换行符
        bufferedWriter.write("贺驰宇是头猪！");
        bufferedWriter.newLine();   //插入一个和系统相关的换行符
        bufferedWriter.write("贺驰宇是头猪！");
        bufferedWriter.newLine();   //插入一个和系统相关的换行符
        bufferedWriter.write("太狗了！");
        //关闭流
        bufferedWriter.close();
    }
}
