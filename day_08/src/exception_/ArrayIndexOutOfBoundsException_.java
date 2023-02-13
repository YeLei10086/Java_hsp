package exception_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 叶磊
 */

//数组下标越界异常
public class ArrayIndexOutOfBoundsException_ {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
