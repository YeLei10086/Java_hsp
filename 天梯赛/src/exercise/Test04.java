package exercise;

/**
 * @author 叶磊
 */
public class Test04 {
    public static void main(String[] args) {
        int x = 0, y = 0;
        do {
            if (x % 3 == 0) {
                x++;
                continue;
            }
            x++;
            y = y + x;
        } while (x < 4);
        System.out.println(y);
        }
}
