import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author 叶磊
 */
public class Exercise01 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        while (true) {
            System.out.println("请输入一个整数");
            try {
                n = Integer.parseInt(reader.readLine());
                break;
            } catch (Exception e) {
                System.out.println("你输入的不是整数，请重新输入！");
            }
            System.out.println(n);
        }
    }
}