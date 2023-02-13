package 递归;

/**
 * @Author YeLei
 * @Date 2021/10/11 16:29
 * @Version 1.0
 *      * 思路分析：
 *      * int[] arr = {1,2,3}
 *      * 1.把需要扩容的数组 加入到index = 1
 *      * 2.int newArr = {0,0,0,0}
 *      * 3.遍历newArr = {1,0,2,3}
 *      * 4.newArr[1] = 999 --> {1,999,2,3}
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int index = 1;
        int addNum = 5;

        int[] newArr = new int[arr.length+1];
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }

        for (int i = 0,j =0; i < newArr.length ; i++) {
            if (i != index){
                newArr[i] = arr[j];
                j++;
            }
        }

        System.out.println();

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }

        System.out.println();

        newArr[index] = addNum;
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }
}
