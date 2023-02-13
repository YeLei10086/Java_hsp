package tuantisai;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L1_058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        line = line.replaceAll("6{9}6+", "27");
        line = line.replaceAll("6{3}6+", "9");
            System.out.println(line);
        }
}
