package standard;

/**
 * @author 叶磊
 * 标准输入 输出
 */
public class InputAndOutput {
    public static void main(String[] args) {
        //System 类 的 public final static InputStream in = null;
        //System.in 的 编译类型 InputStream
        //System.in 的 运行类型 BufferedInputStream (字节流,同时也是处理流)
        //表示标准输入  键盘
        System.out.println(System.in.getClass());

        //public final static PrintStream out = null;
        //System.out 的 编译类型 PrintStream
        //System.out 的 运行类型 PrintStream
        //表示标准输出  显示器
        System.out.println(System.out.getClass());
    }
}
