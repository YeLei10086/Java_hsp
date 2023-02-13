package 小练习.homework6;

/**
 * @author 叶磊
 */
public enum Color implements IMyInterface{
    RED(255,0,0),BLUE(0,0,255),BLACK(0,0,0),
    YELLOW(255,255,0),GERRN(0,255,0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println(redValue + "," + greenValue + "," + blueValue);
    }
}

interface IMyInterface{
    void show();
}