package transformation;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 叶磊
 *
 * PrintWriter 使用
 */
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        //PrintWriter printWriter = new PrintWriter(System.out);
        //输出到文件
        PrintWriter printWriter = new PrintWriter(new FileWriter("D:\\迅雷下载\\测试PrintWriter.txt"));
        printWriter.print("再坚持一下！");

        printWriter.close();    //刷新+关闭
    }
}
