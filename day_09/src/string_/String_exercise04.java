package string_;

/**
 * @author 叶磊
 */
public class String_exercise04 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "yl"; //yl在常量池
        Person p2 = new Person();
        p2.name = "yl"; //yl在常量池

        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name == p2.name);
        System.out.println(p1.name == "yl");

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2);
    }
}

class Person{
    public String name;
}