package arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 叶磊
 */
public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr = {9, 2, 5, 7, 0};
        bubbleSort(arr);
        System.out.println("===排序后的情况===");
        System.out.println(Arrays.toString(arr));

        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i1 - i2;
            }
        });
        System.out.println("===排序后的情况===");
        System.out.println(Arrays.toString(arr));
    }

    //冒泡排序
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //结合冒泡 + 定制排序
    public static void bubble02(int[] arr, Comparator c){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 数组排序由 c.compare(arr[j],arr[j + 1]) 的返回值决定
                if (c.compare(arr[j],arr[j + 1]) > 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
