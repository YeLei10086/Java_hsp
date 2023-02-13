package 基础编程题目;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L7_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char c1 = str.charAt(0);
        int m = sc.nextInt();
        int k = 0;

        if (c1 == '+') {
            System.out.println(n + m);
        }else if (c1 == '-'){
            System.out.println(n - m);
        }else if (c1 == '*'){
            System.out.println(n * m);
        }else if (c1 == '/'){
            if (m != 0)
                System.out.println(n / m);
        }else if (c1 == '%'){
            if (m != 0)
                System.out.println(n % m);
        }else {
            System.out.println("ERROR");
        }
    }
}
