package exercise;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[3];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x = 0;
        if (a > b) {
            x = a;
            a = b;
            b = x;
        }

        if (a > c) {
            x = a;
            a = c;
            c = x;
        }

        if (b > c) {
            x = b;
            b = c;
            c = x;
        }

        System.out.format("%d %d %d", a, b, c);
    }

    public static int max(int a, int b, int c) {
        int max = a > b ? a : b;
        int max2 = max > c ? max : c;
        return max2;
    }
}
