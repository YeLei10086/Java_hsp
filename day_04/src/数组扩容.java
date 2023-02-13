import java.util.Scanner;

public class 数组扩容 {
    /**
     *
     * 思路分析：
     * 1.先创建一个新数组 int[] newArr = new int[arr1.length + 1]
     * 2.遍历arr1将数组拷贝到 newArr
     * 3.newArr[newArr.length - 1] = addNum
     * 4.arr1 = newArr;
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        char chioces = ' ';

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("请选择y/n是否继续添加:");
            chioces = sc.next().charAt(0);
            if (chioces == 'y') {
                System.out.println("请输入一个整数：");
                int addNum = sc.nextInt();
                int[] newArr = new int[arr.length + 1];
                for (int i = 0; i < arr.length; i++) {
                    newArr[i] = arr[i];
                }
                newArr[newArr.length - 1] = addNum;

                for (int i = 0; i < newArr.length; i++) {
                    arr = newArr;
                    System.out.print(arr[i] + "\t");
                }
                System.out.println();
            }
        }while (chioces != 'n' || chioces != 'N');

    }
}
