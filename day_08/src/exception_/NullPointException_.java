package exception_;

/**
 * @author 叶磊
 */

//空指针异常
public class NullPointException_ {
    public static void main(String[] args) {
        String name = "";
        System.out.println(name.length());
    }
}
