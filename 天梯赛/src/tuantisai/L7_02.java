package tuantisai;

import java.util.Scanner;

public class L7_02 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] chars = str.toCharArray();
        String ss = "";
        for (int i = chars.length-1; i >=0; i--) {
            ss+=chars[i];
        }
        System.out.println(Integer.parseInt(ss));
    }
}
