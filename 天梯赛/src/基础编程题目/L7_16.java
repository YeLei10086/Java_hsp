package 基础编程题目;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L7_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[4];
        for (int i = 0; i < 4; i++) {
            m[i] = n + i;
        }

        for (int i = 0; i < 4; i++) {
            int count = 0;
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (i!=j && i!=k && k!=j){
                        System.out.print(m[i]*100 + m[j]*10 + m[k]);
                        count++;
                        if (count == 6){
                            System.out.println();
                        }else {
                            System.out.print(" ");
                        }
                    }
                }
            }
        }
    }
}
