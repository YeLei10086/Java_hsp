public class Demo_06 {
    /**
     * 数组元素反转  使用逆序赋值的方式
     * 思路分析：
     * @param args
     */
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = new int[arr1.length];
        int temp = 0;
        for (int i = 0; i < arr1.length/2; i++) {  // i指次数，同时也是下标
            // i=0  i=4 (arr1.length-1-0)
            // i=1  i=3 (arr1.length-1-1)
            temp = arr1[i];
            arr1[i] = arr1[arr1.length-1-i];
            arr1[arr1.length-1-i] = temp;
        }

        System.out.println("======================================");

        for (int i = 0; i < arr1.length ; i++) {
            arr2[i] = arr1[i];
            System.out.print(arr2[i] + "\t");
        }
    }
}
