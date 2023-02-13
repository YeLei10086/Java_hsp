package string_;

/**
 * @author 叶磊
 */
public class String_exercise07 {
    public static void main(String[] args) {
        Test test = new Test();
        test.change(test.str,test.ch);
        System.out.print(test.str + "and");
        System.out.println(test.ch);
    }
}

class Test{
    String str = new String("hsp"); //堆中
    final char[] ch = {'j','a','v','a'};
    public static void change(String str,char[] ch){
        str = "java";   //常量池
        ch[0] = 'h';
    }
}