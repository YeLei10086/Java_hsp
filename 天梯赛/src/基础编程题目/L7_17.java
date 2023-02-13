package 基础编程题目;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L7_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //井深
        int U = sc.nextInt();   //上爬
        int D = sc.nextInt();   //下滑
        int high = 0;   //记录每次高度
        int time = 0;   //花费时间
        while (high < N){
            high += U;
            time++;
            if (high >= N){
                break;
            }
            high -= D;
            time++;
        }
        System.out.print(time);
    }
}
