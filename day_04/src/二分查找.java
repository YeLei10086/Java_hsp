import java.util.Scanner;

public class 二分查找 {

    public static void main(String[] args) {
        /**
         * 请对一个有序数组进行二分查找 {1,8, 10, 89, 1000, 1234} ，
         * 输入一个数看看该数组是否存在此数，并且求出下标，
         * 如果没有就提示"没有这个数"。
         */

        //数组
        //有序 从小到大
        //思路
        //(1) 希望找一个数 8
        //(2) 先找到 中间这个数 10
        //(3) 让 8 和 中间数10比较，如果 8 大于 中间数，我们就右边继续查找
        //(4) 让 8 和 中间数10比较，如果 8 小于 中间数，我们就左边继续查找
        //循环的执行 (3)和(4)
        //(5) 左边索引 <= 右边索引，还可以找，否则，找不到
        int[] arr = {1,8, 10, 89, 1000, 1234};

        //左边索引下标
        int leftIndex = arr[0];
        //右边索引下标
        int rightIndex = arr.length-1;
        System.out.print("请输入你想要找的数字：");
        Scanner sc = new Scanner(System.in);
        int findNum = sc.nextInt();
        //判断标识
        int index = -1;

        while (leftIndex < rightIndex){
            //找中间数
            int middleIndex = (leftIndex + rightIndex) / 2;
            int middleNum = arr[middleIndex];
            if (middleNum == findNum){
                index = middleIndex;
                break;
            }else if (middleNum > findNum){   //往左边找，左边索引不用动
                rightIndex = middleIndex - 1;
            }else { //右边
                leftIndex = middleIndex + 1;
            }
        }
        if (index == -1){
            System.out.println("没有找到");
        }else {
            System.out.println("找到了，下标为："+index);
        }
    }
}
