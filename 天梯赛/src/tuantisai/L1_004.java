package tuantisai;

import java.util.Scanner;

public class L1_004 {
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int hs = sc.nextInt();
//        int ss = 0;
//        ss = 5*(hs-32)/9;
//        System.out.println("Celsius = "+ss);
//    }
//    static boolean foo(char a) {
//        System.out.print(a);
//        return true;
//    }
//
//    public static void main(String args[]) {
//        int i = 0;
//        for (foo('A'); foo('B') && i < 2; foo('C')){
//            i++;
//            foo('D');
//        }
//    }
    public static void main(String[] args) {
        System.out.println(equals(2, 3, 5));
    }

    public static boolean equals(int a,int b,int c){
        boolean e = (a + b == c);
        return e;
    }
}

