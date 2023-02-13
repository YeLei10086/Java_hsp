package stringbuffer_;

/**
 * @author 叶磊
 * String 与 StringBuffer间的相互转换
 */
public class StringVSStringBuffer {
    public static void main(String[] args) {

        // String --> StringBuffer
        String s1 = "hello";
        //方式1  使用构造器
        //注意：返回的才是StringBuffer的对象,对str本身没有影响
        StringBuffer sb = new StringBuffer(s1);
        //方式2  使用的是append方法
        StringBuffer sb2 = new StringBuffer();
        sb2 = sb2.append(s1);

        // StringBuffer --> String
        StringBuffer sb3 = new StringBuffer("hello");
        //方式1 使用 StringBuffer 提供的 toString方法
        String s2 = sb3.toString();
        //方式2 使用构造器来搞定
        String s3 = new String(sb3);
    }
}
