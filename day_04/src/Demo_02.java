import java.util.Scanner;

public class Demo_02 {
    /**
     * 求出数组中的最大值，并得到对应的下标
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[5];
        //假设第一个就是最大值
        int max = arr[0];
        //此时最大值的下标为0
        int maxIndex = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            System.out.printf("请输入第%d个数:",i);
            arr[i] = sc.nextInt();
            if (max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("max = " + max +",下标 = " +maxIndex);
    }
}
