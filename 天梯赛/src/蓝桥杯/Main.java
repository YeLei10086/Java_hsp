package 蓝桥杯;

/**
 * @author 叶磊
 */
public class Main {
    public static void main(String[] args) {
        int num = 2020;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            String s = String.valueOf(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '2'){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}


