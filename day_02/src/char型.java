public class char型 {
    /**
     * char型:
     *
     * @param args
     */
    public static void main(String[] args) {
       //基本使用
        char c = '男';
        System.out.println("性别："+ c);

//     1.字符常量是用单引号括起来的单字符
//     2.在Java中,char的本质是一个整数，在输出时，是Unicode码对应的字符
        char ch = '叶';
        System.out.println("ch="+ch);
        System.out.println("ch="+(int)ch);

        char ch2 = 'a';
        System.out.println((int)ch2);

//     3.可以直接给char赋一个整数，然后输出时会按照Unicode字符输出
        char ch3 = 97;
        System.out.println("ch3="+ch3);
        System.out.println("ch3="+(int)ch3);

//     4.char类型是可以进行运算的，相当于一个整数，因为它们都有对应的Unicode码
        char ch4 = 'a';
        System.out.println(ch4 + 10);

//        System.out.println("hello"+100+3);  // hello1003


    }
}
