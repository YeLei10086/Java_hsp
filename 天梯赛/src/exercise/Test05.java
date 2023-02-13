package exercise;

/**
 * @author 叶磊
 */
public class Test05 {
    public static void main(String[] args) {
        int wight = 180;
        int wight2 = 200;
        int wight3 = 160;
        int max = wight > wight2 ? wight : wight2;
        int max2 = max > wight3 ? max : wight3;
        System.out.println(max2);
    }
}
