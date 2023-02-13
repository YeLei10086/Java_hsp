package tuantisai;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L1_005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[][] str = new String[num][3];
        for (int i = 0; i < num; i++) {
            str[i][0] = sc.next();
            str[i][1] = sc.next();
            str[i][2] = sc.next();
        }

        int num2 = sc.nextInt();
        for (int i = 0; i < num2; i++) {
            int i1 = sc.nextInt();
            for (int j = 0; j < num; j++) {
                if (i1 == Integer.parseInt(str[j][1])){
                    System.out.println(str[j][0] + " " + str[j][2]);
                    break;
                }
            }
        }
    }
}
