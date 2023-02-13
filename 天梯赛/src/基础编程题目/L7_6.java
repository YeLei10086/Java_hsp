package 基础编程题目;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L7_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        int b = sc.nextInt();
        char c = sc.next().charAt(0);
        float d = sc.nextFloat();
        System.out.printf("%c %d %.2f %.2f",c,b,a,d);
    }
}
