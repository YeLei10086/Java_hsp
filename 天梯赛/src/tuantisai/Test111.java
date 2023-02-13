package tuantisai;

import java.util.Scanner;
/**
 * @author 叶磊
 */
public class Test111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d2;
        String[] str = new String[n];
        double[] d1 = new double[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
            d1[i] = sc.nextDouble();
        }

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("M")){
                d2 = d1[i] / 1.09;
                System.out.printf("%.2f\n",d2);
            }
            if (str[i].equals("F")){
                d2 = d1[i] * 1.09;
                System.out.printf("%.2f\n",d2);
            }
        }
    }
}
