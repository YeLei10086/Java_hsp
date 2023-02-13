package tuantisai;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L1_050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i;

        String s = "";
        for (i = 0; i < a; i++) {
            s += "a";
        }

        double q = Math.pow(26, (double) a);
        double q1 = q - b;

        char[] ch = new char[6];
        for (i = 0; i < a; i++) {
            ch[i] = (char) (97 + q1 % 26);
            q1 /= 26;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.println(ch[i]);
        }
    }
}
