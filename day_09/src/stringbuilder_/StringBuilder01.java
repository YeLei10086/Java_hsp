package stringbuilder_;

/**
 * @author 叶磊
 */
public class StringBuilder01 {
    public static void main(String[] args) {
        // 1.StringBuilder 是 final类，不能被继承
        // 2.StringBuilder 的直接父类是 AbstractStringBuilder
        // 3.StringBuilder 实现了 Serializable 接口（即StringBuffer对象可以进行串行化）,可以保存到文件，或进行网络传输
        // 4.StringBuilder 对象字符序列仍然是存放在其父类 AbstractStringBuilder 的 char[] value; 因此，字符序列存放在堆中
        // 5.StringBuilder 的方法，没有做互斥的处理，即没有 synchronized 关键字，因此在单线程的情况下使用 StringBuilder
        StringBuilder sb = new StringBuilder();
    }
}
