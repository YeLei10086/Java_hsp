package tuantisai;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L1_017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        int count = 0;
        //取个位数，用于判断是否被2整除
        int num = (int) (chars[str.length() - 1]) - 48;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 2 + 48) {   //ASCII码 2+48 等于 '2'
                count++;
            }
        }

        double res;
        //如果是负数
        if (chars[0] == '-'){
            //并且是偶数
            if (num % 2 == 0){
                res = 1.0 * count / (chars.length-1) * 1.5 * 2 * 100;
                System.out.print(String.format("%.2f",res) + "%");
            }else {   //是负数不是偶数
                res = 1.0 * count / (chars.length-1) * 1.5 * 100;
                System.out.print(String.format("%.2f",res) + "%");
            }
        }else { //由于不是负数，因此数组长度不需要-1
            //不是负数但 是偶数
            if (num%2 == 0){
                res = 1.0 * count / chars.length * 2 * 100;
                System.out.print(String.format("%.2f",res) + "%");
            }else { //不是负数也不是偶数
                res = 1.0 * count / chars.length * 100;
                System.out.print(String.format("%.2f",res) + "%");
            }
        }
    }
}
