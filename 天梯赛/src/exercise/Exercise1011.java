package exercise;

import java.util.Scanner;

public class Exercise1011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int i = sc.nextInt();
        while(n <= i){
            n++;
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            if(a+b>c){
                System.out.println((a+b>c));
            }else{
                System.out.println((a+b>c));
            }
        }
    }
}
