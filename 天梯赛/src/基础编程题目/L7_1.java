package 基础编程题目;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //那么对应的米是(foot+inch/12)×0.3048
        //如果用户输入的是厘米数，那么对应英制长度的英尺和英寸是多少呢？别忘了1英尺等于12英寸。
        int foot = (int) (n*1.0/100/0.3048);
        int inch = (int) (((n*1.0/100/0.3048)-foot)*12);
        System.out.println(foot+" "+inch);
    }
}
