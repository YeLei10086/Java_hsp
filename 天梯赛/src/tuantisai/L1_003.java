package tuantisai;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L1_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] nums = new int[10];
        for (int i = 0; i < s.length(); i++) {  //循环遍历输入的字符串，获取到每一个位置上的数字
            int n = s.charAt(i) - 48;   //把字符串转换成数字（char类型的数字为ASCII码需要减去48转换成数字）
            nums[n]++;     //把每一个数字存起来
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){     //如果i的个数 != 0 , 输出
                System.out.println(i + ":" + nums[i]);
            }
        }
    }
}
