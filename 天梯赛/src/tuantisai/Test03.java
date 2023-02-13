package tuantisai;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class Test03 {
    public static void main(String[] args) {
        /*
        一个整数“犯二的程度”定义为该数字中包含2的个数与其位数的比值。
        如果这个数是负数，则程度增加0.5倍；如果还是个偶数，则再增加1倍。
        例如数字-13142223336是个11位数，其中有3个2，并且是负数，也是偶数，
        则它的犯二程度计算为：3/11×1.5×2×100%，约为81.82%。
        本题就请你计算一个给定整数到底有多二。
        在一行中输出N犯二的程度，保留小数点后两位。
         */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        //包含2的个数
        int count = 0;
        //位数的比值
        int num = (int) (chars[str.length() - 1]) - 48;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 2 + 48) {
                count++;
            }
        }

        double res = 0.0;
        if (chars[0] == '-') {
            if (num % 2 == 0) {
                res = 1.0 * count / (chars.length - 1) * 1.5 * 2 * 100;
                System.out.println(String.format("%.2f", res) + "%");
            } else {
                res = 1.0 * count / (chars.length - 1) * 1.5 * 100;
                System.out.println(String.format("%.2f", res) + "%");
            }
        } else {
            if (num % 2 == 0) {
                res = 1.0 * count / chars.length * 2 * 100;
                System.out.println(String.format("%.2f", res) + "%");
            } else {
                res = 1.0 * count / chars.length * 100;
                System.out.println(String.format("%.2f", res) + "%");
            }
        }
    }
}
