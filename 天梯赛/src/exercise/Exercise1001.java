package exercise;

import java.util.Scanner;

public class Exercise1001 {

    public static void main(String[] args) {
        Exercise1001 exercise1001 = new Exercise1001();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(exercise1001.f1(num));
    }

    public int f1(int num){
        int count = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = (3 * num + 1) / 2;
            }
            count++;
        }
        return count;
    }
}
