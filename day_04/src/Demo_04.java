public class Demo_04 {
    /**
     * 引用类型
     *      如何copy新的数组，而不是引用相同的数组
     * @param args
     */
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = new int[arr1.length];

        // 遍历arr1 将 arr1的数据拷贝给 arr2
        for (int i = 0; i < arr1.length ; i++) {
            arr2[i] = arr1[i];
        }

        arr1[0] = 888;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
    }
}
