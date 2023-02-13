package math_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 叶磊
 */
public class 随机数 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getRandomInt(2, 7));
        }
    }

    //获取一个 a - b 之间的一个随机整数，区间[2,7]
    public static int getRandomInt(int num1,int num2) {
        // 随机数公式： (int) (a + Math.random() * (b - a + 1))
        int n =(int) (num1 + Math.random() * (num2 - num1 + 1));
        return n;
    }
}
