package stringbuffer_;

/**
 * @author 叶磊
 * StringBuffer 构造器的使用
 */
public class StringBuffer02 {
    public static void main(String[] args) {
        // 1.下面这句话会 创建一个初始值大小为16的一个char[]数组，用于存放字符内容
        StringBuffer sb = new StringBuffer();

        // 2.还可以通过构造器指定 char[]的初始值大小
        StringBuffer sb2 = new StringBuffer(100);

        //通过 给一个String 创建 StringBuffer, char[] 的大小就是 string.length() + 16;
        StringBuffer sb3 = new StringBuffer("hello");   // 断点追源码  这里的char[] 数组大小为21


    }
}
