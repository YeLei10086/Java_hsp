package 基础编程题目;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L7_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double f1 = 0;
        if (x>0) {
            if (x < 15) {
                f1 = 4 * x / 3;
            } else {
                f1 = 2.5 * x - 17.5;
            }
            System.out.printf("%.2f",f1);
        }
    }
}
