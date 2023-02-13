package tuantisai;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L1_55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pa = sc.nextInt();
        int pb = sc.nextInt();
        int a = 0,b = 0,x = 0;
        for (int i = 0; i < 3; i++) {
            x = sc.nextInt();
            if (x == 0){
                a++;
            }else {
                b++;
            }
        }

        if (pa > pb && a != 0){
            System.out.format("The winner is a: %d + %d\n",pa,a);
        }else if (pa < pb && b != 0){
            System.out.format("The winner is b: %d + %d\n",pb,b);
        }else if (pa < pb && a == 3){
            System.out.format("The winner is a: %d + %d\n",pa,a);
        }else if (pa > pb && b == 3){
            System.out.format("The winner is b: %d + %d\n",pb,b);
        }
    }
}
