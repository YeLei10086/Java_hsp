package 小练习.homework6;

/**
 * @author 叶磊
 */
public class Test {
    public static void main(String[] args) {
        Color color = Color.BLUE;
        color.show();

        switch (color){
            case RED:
                System.out.println("匹配到红色");
                break;
            case BLUE:
                System.out.println("匹配到蓝色");
                break;
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            case GERRN:
                System.out.println("匹配到绿色");
                break;
            default:
                System.out.println("没有匹配到相同颜色");
        }
    }
}
