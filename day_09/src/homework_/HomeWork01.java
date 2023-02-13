package homework_;

/**
 * @author 叶磊
 */

import java.util.Scanner;

/**
 * 指定位置反转字符串
 */
public class HomeWork01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一串字符串：");
        String s = null;
        String reverse = null;
        try {
            s = sc.next();
            reverse = reverse(s, 1, 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("交换前 = " + s);
        System.out.println("交换后 = " + reverse);
    }

    public static String reverse(String str,int start,int end){
        //对输入的参数做一个校验
        if (!(str != null && start >= 0 && end > start && end < str.length())){
            throw new RuntimeException("参数异常");
        }
        char[] chars = str.toCharArray();
        char temp = ' ';
        for (int i = start , j = end; i < j ; i++ , j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);

    }
}
