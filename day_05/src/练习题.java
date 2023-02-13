public class 练习题 {

    /**
     * 逆序输出
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }
    }
}
