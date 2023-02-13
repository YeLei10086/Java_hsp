package string_;

/**
 * @author 叶磊
 *
 * 字符串的特性
 */
public class String_exercise05 {
    public static void main(String[] args) {
        // 1.String 是一个final类，代表不可变的字符序列
        // 2.字符串是不可变的。一个字符串对象一旦被分配，其内容是不可变的
        /**
         * 下面代码一共创建了几个对象？
         *  答：这里实际上是创建了两个对象，第一个对象hello其实是存在的，只不过指向的是第二个对象haha
         */
//        String str = "hello";
//        str = "haha";

        /**
         * 下面代码一共创建了几个对象？
         * 答：只有一个对象
         * 解析：编译器不是傻子，它在底层做了优化，判断创建的常量池对象，是否有指向引用
         */
//        String s2 = "abc" + "zxc";

        /**
         * 下面代码一共创建了几个对象？
         * 答：三个对象
         */
        String a = "hi";
        String b = "yl";
        /**
         * 详解：
         *   1.先创建一个 StringBuilder sb = StringBuilder()
         *   2.执行 sb.append("hi");
         *   3.再次执行 sb.append("yl");
         *   4. String c = sb.toString();
         *   最后其实是 c 指向了堆中的对象 (String) value[] --> 池中的"hiyl"
         *
         *   总结： 常量相加     看常量池   例: String c = "ab" + "cd"      3个对象
         *         变量相加     是在堆中   例: String c = a + b;
         */
        String c = a + b;   // 堆中
        //再问 T or F ?
        String d = "hiyl";  //常量池中
        System.out.println(c == d); //F
        //再问 T or F ?
        String e = "hi" + "yl"; //常量相加     看常量池
        System.out.println(d == e); // T
    }
}
