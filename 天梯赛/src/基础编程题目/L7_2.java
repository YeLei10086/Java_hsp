package 基础编程题目;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int add = n / 100 * 60 + n % 100 + m;  //把n的小时 × 60 + m 和 n除去小时还剩下的分钟
        int hour = add / 60;   // 再除以60 得出小时
        int mins = add % 60;    // 除去小时，还剩下的分钟
        if (hour == 0) {
            System.out.println("0" + mins); //当小时为个位数时，没有前导的零
        } else {
            System.out.println(hour * 100 + mins); //小时和分钟相加输出
        }
    }
}
