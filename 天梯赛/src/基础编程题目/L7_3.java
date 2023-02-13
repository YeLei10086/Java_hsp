package 基础编程题目;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();   //先把这个数转换成char数组
        String str2 = "";   //定义一个str2 作 拼接
        for (int i = chars.length-1; i >= 0; i--) {
            str2 += chars[i];   //拼接
        }
        System.out.println(Integer.parseInt(str2));
    }
}
