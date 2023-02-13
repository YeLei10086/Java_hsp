package homework_;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class HomeWork03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        print(str);
//        String[] str2 = str.split(" ");
//        String str3 = "";
//        String str4 = "";
//        str3 = str2[0];
//        str4 = str2[1];
//        str2[0] = str2[str2.length-1];
//        str2[1] = str3;
//        str2[str2.length-1] = str4;
//        for (int i = 0; i < str2.length; i++) {
//            if ((str2[i] == str2[0])){
//                System.out.print(str2[i] + ",");
//            }else if (str2[i] == str2[1]){
//                System.out.print(str2[i]);
//            } else {
//                String substring = str2[i].substring(0, 1);
//                System.out.print("." + substring);
//            }
//        }
    }

    public static void print(String s){
        if (s == null){
            System.out.println("s 不能为 null");
            return;
        }

        String[] split = s.split(" ");

        if (split.length != 3){
            System.out.println(" s 长度错误");
            return;
        }

        String format = String.format("%s,%s.%c", split[2], split[0], split[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
