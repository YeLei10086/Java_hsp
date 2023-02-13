package exercise;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class Test07 {
    public static void main(String[] args) {
//        int num = (int)(Math.random() * 100 + 1);
//        while(true){
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            if (n == num){
//                break;
//            }
//        }
            String str = "runoob";
            str.toUpperCase();
            str += "wwwrunoobcom";
            String string = str.substring(2,13);
            string = string + str.charAt(4);;
            System.out.println(string);
    }
}
