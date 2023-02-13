package printstream;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author 叶磊
 *
 * PrintStream 字节打印流
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        /*
        源码：
        //在默认情况下,PrintStream 输出数据的位置是 标准输出,即显示器输出
            public void print(String s) {
                if (s == null) {
                    s = "null";
                }
                write(s);
            }
         */
        out.print("hello，猪头");
        //因为print底层使用的是write,所以我们可以直接调用 write 进行打印/输出
        out.write("无语了".getBytes());

        //我们可以去修改打印流输出的位置
        //修改输出位置
        System.setOut(new PrintStream("D:\\迅雷下载\\修改PrintStream输出位置.txt"));
        System.out.println("再坚持一下，加油！");
        out.close();    //刷新+关闭
    }
}
