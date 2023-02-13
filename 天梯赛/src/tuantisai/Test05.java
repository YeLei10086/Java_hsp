package tuantisai;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = n; i <= m ; i++) {
            sum += i;
            count++;
            System.out.printf(String.format("%5d", i));
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        if (count != 5){
            System.out.println();
        }
        System.out.println("Sum = " + sum);
    }
}
