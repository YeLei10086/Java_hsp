import java.util.Scanner;

public class 练习题4 {
    /**
     * 有一个数组{1，2，3，4，5},可以将该数组进行缩减，提示用户是否继续缩减，每次缩减一个元素。
     * 当只剩下最后一个元素时，提示不能再缩减了
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        char key = ' ';

        do {
            if (arr.length == 1){
                System.out.println("已经是最后一个数了，不能进行缩减！");
                break;
            }
            System.out.println("目前有"+ arr.length + "个数字");
            Scanner sc = new Scanner(System.in);
            System.out.println("\n请输入y/n（是否缩减数组大小）:");
            key = sc.next().charAt(0);

            if (key == 'y') {
                //思路
                //1.创建一个新数组
                int[] newArr = new int[arr.length - 1];
                //2.将arr数组的前面4个数拷贝
                for (int i = 0; i < newArr.length; i++) {
                    newArr[i] = arr[i];
                }
                arr = newArr;
                //输出
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + "\t");
                }
            }
        }while (key != 'n');
    }
}
