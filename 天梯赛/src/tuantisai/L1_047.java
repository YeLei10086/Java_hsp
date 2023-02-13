package tuantisai;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L1_047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] str = new String[num];
        int[] n = new int[num];
        int[] m = new int[num];
        for (int i = 0; i < num; i++) {
            str[i] = sc.next();
            n[i] = sc.nextInt();
            m[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            if (n[i] < 15 || n[i] > 20 || m[i] <50 || m[i] > 70)
                System.out.println(str[i]);
        }
    }
}
