package tuantisai;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L1_053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        f1(n,m);
    }

    public static void f1(int num,int num2){
        int num3;
        num3 =  num + num2;
        for (int i = 0; i < num3; i++) {
            System.out.print("Wang!");
        }
    }
}
