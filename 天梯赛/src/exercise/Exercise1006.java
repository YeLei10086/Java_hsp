package exercise;

import java.util.Scanner;

public class Exercise1006 {

    public static void main(String[] args) {

        Exercise1006 exercise1006 = new Exercise1006();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        exercise1006.f1(num);
    }

    public void f1(int num){
        int g = num % 10;
        int s = num / 10 % 10;
        int b = num / 100;

        for (int i = 0; i < b; i++) {
            System.out.print("B");
        }
        for (int j = 0; j < s; j++) {
            System.out.print("S");
        }
        for (int k = 1; k <= g; k++) {
            if (g<10) System.out.print(k);
        }
    }
}
