package tuantisai;

import java.util.Scanner;

public class L7_01 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int[] result = new int[str.length()];

        int temp, i;
        int res = Integer.parseInt(str);

        for (i = 0; i < str.length(); i++) {
            temp = res % 10;
            result[i] = temp;
            res = res / 10;
        }
        for (i = 0; i < str.length(); i++) {
            if(result[i]==0){
                continue;
            }
            System.out.print(result[i]);
        }
    }
}
