package 基础编程题目;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L7_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double open = sc.nextDouble();
        double high = sc.nextDouble();
        double low = sc.nextDouble();
        double close = sc.nextDouble();

        if (close < open){
            System.out.print("BW-Solid");
        }else if (open > close){
            System.out.print("R-Hollow");
        }else if (open == close){
            System.out.print("R-Cross");
        }

        boolean b = (low < open && low < close) && (high > open && high > close);
        if (b){
            System.out.println(" with Lower Shadow and Upper Shadow");
        }else if (high > open && high > close){
            System.out.print(" Upper Shadow");
        }else if (low < open && low < close) {
            System.out.print(" Lower Shadow");
        }
    }
}
