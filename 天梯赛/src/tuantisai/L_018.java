package tuantisai;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class L_018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] split = line.split(":");
        int hours = Integer.parseInt(split[0]);
        int mins = Integer.parseInt(split[1]);
        int time = 0;
        if (hours <= 12) {
            System.out.format("Only %02d:%02d.  Too early to Dang.\n", hours, mins);
        } else {
            if (mins == 0) {
                time = hours - 12;
            } else {
                time = hours - 11;
            }
        }

        for (int i = 0; i < time; i++) {
            if (i == time - 1) {
                System.out.println("Dang");
            } else {
                System.out.print("Dang");
            }
        }
    }
}
