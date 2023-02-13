public class Demo_05 {
    /**
     * 数组元素反转
     * 思路分析：
     *      1.第一个元素和最后一个元素交换，第二个元素和倒数第二个交换，以此类推
     *      2.交换次数 arr1.length / 2
     * @param args
     */
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int temp = 0;
        for (int i = 0; i < arr1.length/2; i++) {  // i指次数，同时也是下标
            // i=0  i=4 (arr1.length-1-0) i指下标
            // i=1  i=3 (arr1.length-1-1)
            temp = arr1[i];
            arr1[i] = arr1[arr1.length-1-i];
            arr1[arr1.length-1-i] = temp;
        }

        System.out.println("======================================");

        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }
}
