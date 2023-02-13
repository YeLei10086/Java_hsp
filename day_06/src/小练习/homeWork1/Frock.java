package 小练习.homeWork1;

/**
 * @author 叶磊
 */
public class Frock {
    private static int currentNum = 10000;

    private int serialNumber;

    public static int getNextNum(){
        return currentNum += 100;
    }

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

}
