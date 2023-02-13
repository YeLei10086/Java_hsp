package exercise;

import javax.lang.model.element.VariableElement;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author 叶磊
 */
public class Test09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] split = n.split(" ");
        int countA = 0;
        int countB = 0;

        for (int i = 0; i < split.length; i++) {
            int parseInt = Integer.parseInt(split[i]);
            if (parseInt == -1){
                break;
            }else if (parseInt % 2 == 0){
                countA++;
            }else {
                countB++;
            }
        }
        System.out.println("偶数 = " + countA + " , " + "奇数 = " + countB);
    }

}
