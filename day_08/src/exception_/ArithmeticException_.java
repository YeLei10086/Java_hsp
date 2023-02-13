package exception_;

/**
 * @author 叶磊
 */

/**
 * Throwable 分为两种：
 *  一、致命异常 error    二、运行时异常exception
 *  致命异常是处理不了的，必然报错
 *  运行时异常是可以处理的
 *  运行时异常又分为： 编译时异常 和 运行时异常
 *  编译时异常指 在代码还没有执行时，会给出提示，提醒我们添加异常处理
 *  运行时异常指 代码已经run了，但是发生了错误，我们可以对它进行处理
 */

//算术运算异常
public class ArithmeticException_ {
    public static void main(String[] args) {
        //运行时异常
        int n = 10;
        int m = 0;
        int num = 0;

        try {
            num = n / m;
        } catch (Exception e) {
            System.out.println("报错原因：" + e.getMessage());
        }

        System.out.println("程序结束运行...");
    }
}
