package string_;

/**
 * @author 叶磊
 *  字符串特性练习
 */
public class String_exercise06 {
    public static void main(String[] args) {
        String s1 = "hspedu";
        String s2 = "java";
        String s3 = "hspedujava";
        String s4 = (s1+s2).intern();

        System.out.println(s3 == s4);//T
        System.out.println(s3.equals(s4));//T
    }
}
