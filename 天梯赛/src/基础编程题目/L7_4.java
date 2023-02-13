package 基础编程题目;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L7_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = n / 16; //转回16进制
        int b = n % 16; //超过16，但不能让它转换成A-F
        System.out.println( a * 10 + b);
    }
}
