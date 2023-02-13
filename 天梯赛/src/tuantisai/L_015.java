package tuantisai;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L_015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = sc.next().charAt(0);
        for (int i = 0; i < (int) (1.0 * n / 2 + 0.5); i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
