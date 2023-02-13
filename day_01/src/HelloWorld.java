public class HelloWorld {
    /**
     * 类名的首字母必须大写
     * public 公用类
     * static 表示静态
     * void 表示无返回值
     * String[] args 表示形参
     * @param args
     *
     * 1)Java源文件以“java”为扩展名。源文件的基本组成部分是类（class），如本类中的HelloWorld类。
     * 2)Java应用程序的执行入口是main()方法。它有固定的书写格式：public static void main(String[] args)  {...}
     * 3)Java语言严格区分大小写。
     * 4)Java方法由一条条语句构成，每个语句以“;”结束。
     * 5)大括号都是成对出现的，缺一不可。[习惯，先写 {} 再写代码]
     * 6)一个源文件中最多只能有一个public类。其它类的个数不限。[演示]
     * 7)如果源文件包含一个public类，则文件名必须按该类名命名!
     * 8)一个源文件中最多只能有一个public类。其它类的个数不限，也可以将main方法写在非public类中，然后指定运行非public 类，这样入口方法就是非public 的main方法。
     */
    public static void main(String[] args){
        System.out.println("hello\tworld");
    }

//    大括号都是成对出现的，缺一不可。[习惯，先写 {} 再写代码]
//    public void sum(){}
}

///**
// * 如果源文件包含一个public类，则文件名必须按该类名命名!
// */
//public class dog{
//    public static void main(String[] args) {
//
//    }
//}

/**
 * 一个源文件中最多只能有一个public类。其它类的个数不限，也可以将main方法写在非public类中，
 * 然后指定运行非public 类，这样入口方法就是非public 的main方法。
 */
class dog{
    public static void main(String[] args) {
        System.out.println("没有public,所以可以写！");
    }
}






