package exercise;

/**
 * @author 叶磊
 */
public class Test06 {
    public static void main(String[] args) {
        double sf = 8844430;
        double z = 0.1;
        int count = 0;
        while (z <= sf){
            z *= 2;
            count++;
        }
        System.out.println(count);
    }
}
