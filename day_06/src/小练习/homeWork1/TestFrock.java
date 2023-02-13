package 小练习.homeWork1;

/**
 * @author 叶磊
 */
public class TestFrock {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());

        Frock frock = new Frock();
        System.out.println(frock.getSerialNumber());
        Frock frock2 = new Frock();
        System.out.println(frock2.getSerialNumber());
        Frock frock3 = new Frock();
        System.out.println(frock3.getSerialNumber());


    }
}
