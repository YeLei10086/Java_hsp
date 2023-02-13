package exception_;

/**
 * @author 叶磊
 */
//数字格式不正确异常
//当应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为适合的格式时，抛出该异常
public class NumberFormatException_ {
    public static void main(String[] args) {
        String a = "abcdefg";
        int b = Integer.parseInt(a);
        System.out.println(b);

    }
}
