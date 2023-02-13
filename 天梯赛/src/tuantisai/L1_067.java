package tuantisai;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L1_067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double v;
        if (n2 == 0){
            v = n * 2.455;
        }else{
            v = n * 1.26;
        }

        if (v < n3){
            System.out.printf("%.2f ^_^",v);
        }else {
            System.out.printf("%.2f T_T",v);
        }
    }
}
