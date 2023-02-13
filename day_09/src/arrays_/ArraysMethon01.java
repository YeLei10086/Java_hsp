package arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 叶磊
 */
public class ArraysMethon01 {
    public static void main(String[] args) {
        Integer[] integers = {20,7,15};
        // 直接使用Arrays.toString方法,显示数组
        System.out.println(Arrays.toString(integers));

        // Arrays.sort 排序
        Integer[] arr = {9,5,2,7,0};
        // 1、可以直接使用冒泡排序,也可以直接使用Arrays提供的sort方法排序
        // 2、因为数组是引用类型,所以通过sort排序后，会直接影响到 实参
        //Arrays.sort(arr);
        // 3、sort重载的，也可以通过传入一个接口 Comparator 实现定制排序
        // 4、调用 定制排序 时，传入两个参数（1）排序的数组 arr,（2）实现了Comparator接口的匿名内部类,要求实现 compare 方法
        // 5、这里体现了接口式编程,断点看源码

        //定制排序
        //源码分析
        // (1)  Arrays.sort(arr, new Comparator<Integer>()
        // (2)  最终到 TimSort类的 private static <T> void binarySort(T[] a, int lo, int hi, int start, Comparator<? super T> c)
        // (3)  执行到 binarySort方法的代码,会根据动态绑定机制 c.compare() 执行我们传入的匿名内部类的 compare()
        /*
            while (left < right) {
            int mid = (left + right) >>> 1;
            if (c.compare(pivot, a[mid]) < 0)
                right = mid;
            else
                left = mid + 1;
            }
       */
        // (4)  new Comparator<Integer>() {
        //            @Override
        //            public int compare(Integer o1, Integer o2) {
        //                return o2 - o1;
        //            }
        //        });
        // (5) public int compare(Integer o1, Integer o2) 返回的值>0 还是 <0 ,会影响整个排序结果
        //      这里就充分体现了 接口编程 + 动态绑定 + 匿名内部类 的综合使用
        //      将来的底层框架和源码的使用方式中，会非常常见
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println("===排序后===");
        System.out.println(Arrays.toString(arr));
    }
}
