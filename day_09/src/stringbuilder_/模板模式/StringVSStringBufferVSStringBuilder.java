package stringbuilder_.模板模式;

/**
 * @author 叶磊
 */
public class StringVSStringBufferVSStringBuilder {
    public static void main(String[] args) {
        new StringBuffer_().currentTime();  //线程安全 StringBuffer
        new StringBuilder_().currentTime(); //线程不安全 StringBuilder
        new String_().currentTime();
    }
}
