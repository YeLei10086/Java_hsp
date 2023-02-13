package arrays_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 叶磊
 */
public class ArraysMethon02 {
    public static void main(String[] args) {
        Integer[] arr = {1,5,7,9,100};
        // binarySearch 通过二分搜索法进行查找,
        // 要求：必须是有序的才可以使用，如果该数组是无序的，不能使用binarySearch
        // 如果数组中，不存在该元素，返回  return -(low + 1);  // key not found.
        int i = Arrays.binarySearch(arr, 101);  // 101 是不存在的，因此返回 101 应该存在的下标位置 +1 = -6
        System.out.println("index = " + i);  //返回下标

        //copyOf 数组元素复制
        // 1.从arr数组中,拷贝 arr.length 个元素到 newArr数组中
        // 2.如果拷贝的长度 > arr.length 就在新数组后面 增加 null
        // 3.如果拷贝的长度 < 0 就抛出异常 NegativeArraySizeException
        // 4.该方法底层执行的是 System.arraycopy() 方法
        Integer[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println("==拷贝执行完成==");
        System.out.println(Arrays.toString(copy));

        //fill 数组元素的填充
        Integer[] arr2 = new Integer[]{9,5,2,7};
        //将元素中的值全部替换成66
        Arrays.fill(arr2,66);
        System.out.println(Arrays.toString(arr2));

        //equals 比较两个元素的内容是否完全相同
        Integer[] arr3 = {1,5,7,9,100};
        System.out.println("equals=" + Arrays.equals(arr, arr3));

        //aslist 将一组值 转换成list集合
        //编译类型 List
        //运行类型  class java.util.Arrays$ArrayList，是Arrays的一个静态匿名内部类
        //private static class ArrayList<E> extends AbstractList<E>
        //        implements RandomAccess, java.io.Serializable
        List aslist = Arrays.asList(arr3);
        System.out.println(aslist);
        System.out.println("aslist的运行类型 = " + aslist.getClass());

    }
}
