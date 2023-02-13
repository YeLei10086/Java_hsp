package tuantisai;

import java.util.ArrayList;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> alist = new ArrayList<String>();
        char[] x = { '1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2' };
        int[] qz = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
        int n = sc.nextInt();
        String[] str = new String[n];
        char[][] c = new char[n][18];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
            c[i] = str[i].toCharArray();
            int sum = 0;
            for (int j = 0; j < 17; j++) {
                try {
                    sum += Integer.parseInt((c[i][j] + "")) * qz[j];
                } catch (Exception e) {
                    sum = -1;
                    break;
                }
            }
            if (sum == -1) {
                alist.add(str[i]);
            } else {
                sum %= 11;
                if (!(x[sum] + "").equals((c[i][17]) + "")) {
                    alist.add(str[i]);
                }
            }
        }
        if (alist.isEmpty()) {
            System.out.print("All passed");
        } else {
            for (String ss : alist) {
                System.out.println(ss);
            }
        }
    }

}
