package 面试题;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        int b = sc.nextInt();
        float sum = 0;
        for (int i = b; i > 0; i--) {
            sum += 2 * a;
            a = a / 2;

        }
        a -= 100;
        System.out.println(sum + "米");
    }
}
