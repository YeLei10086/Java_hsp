package tuantisai;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        int[] count = new int[10];
        for (int i = 0; i < chars.length; i++) {
            int num = str.charAt(i) - 48;
            count[num]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0){
                System.out.println(i + ":" + count[i]);
            }
        }
    }
}
