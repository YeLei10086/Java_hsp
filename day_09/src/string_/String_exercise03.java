package string_;

/**
 * @author 叶磊
 */
public class String_exercise03 {
    public static void main(String[] args) {
        String s1 = "yl";   // 指向常量池地址
        String s3 = "java";
        String s4 = "java";
        String s5 = new String("java"); //指向堆中对象

        System.out.println(s3 == s5);
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s3 == s5.intern());  //T
        System.out.println(s5 == s5.intern());
    }
}
