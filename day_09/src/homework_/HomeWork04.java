package homework_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author 叶磊
 */
public class HomeWork04 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        print(str);
        System.out.println("请输入：");
        String input = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        print(input);
    }

    public static void print(String str){
        if (str == null){
            System.out.println("不能为null！");
            return;
        }

        int strLength = str.length();
        int numCount = 0;
        int upperCount = 0;
        int lowerCount = 0;
        int otherCount = 0;
        for (int i = 0; i < strLength; i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                numCount++;
            }else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                lowerCount++;
            }else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                upperCount++;
            }else {
                otherCount++;
            }
        }

        System.out.println("数字有 ：" + numCount);
        System.out.println("小写字母有 ：" + lowerCount);
        System.out.println("大写字母有 ：" + upperCount);
        System.out.println("其他字符有 ：" + otherCount);
    }
}
