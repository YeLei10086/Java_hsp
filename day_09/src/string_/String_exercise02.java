package string_;

/**
 * @author 叶磊
 */
public class String_exercise02 {
    public static void main(String[] args) {

        String s1 = "abc";  //s1 指向的是 常量池的 "abc"
        String s2 = new String("abc");  //s2 指向的是 堆中的对象

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        // intern() 最终返回的是常量池中的地址()
        System.out.println(s1 == s2.intern());
        System.out.println(s2 == s2.intern());
    }
}
