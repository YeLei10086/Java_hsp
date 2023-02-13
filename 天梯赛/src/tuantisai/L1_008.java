package tuantisai;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L1_008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = n; i <= m; i++) {
            sum += i;
            count++;
            System.out.print(String.format("%5d", i));
            if (count % 5 == 0 && i != m) {
                System.out.println();
            }
        }
        System.out.printf("\nSum = %d", sum);
    }
}
