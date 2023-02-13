package 基础编程题目;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L7_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N>=1 && N<=9) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.printf("%d*%d=%-4d",j,i,j*i);
                }
                System.out.println();
            }
        }
    }
}
