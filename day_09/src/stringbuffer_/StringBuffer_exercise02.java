package stringbuffer_;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class StringBuffer_exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.nextLine();

        StringBuffer sb = new StringBuffer(str2);
        for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3) {
            sb.insert(i,",");
        }
        System.out.println("商品" + "\t" + "商品价格");
        System.out.println(str + "\t" + sb);

    }
}
