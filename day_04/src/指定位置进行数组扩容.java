public class 指定位置进行数组扩容 {
    /**
     *
     * 思路分析：
     * int[] arr = {1,2,3}
     * 1.把需要扩容的数组 加入到index = 1
     * 2.int newArr = {0,0,0,0}
     * 3.遍历newArr = {1,0,2,3}
     * 4.newArr[1] = 999 --> {1,999,2,3}
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3};  // j
        int index = 1;
        int addNum = 5;

        // 创建新的数组
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length ; i++) {
            System.out.print(newArr[i] + "\t");
        }
        System.out.println();

        for (int i = 0, j = 0; i < newArr.length ; i++) {
            if (i != index){  //如果当前i 不是 index
                newArr[i] = arr[j];
                j++;
            }
        }
        System.out.println();

        for (int i = 0; i < newArr.length ; i++) {
            System.out.print(newArr[i] + "\t");
        }
        System.out.println();

        newArr[index] = addNum;
        for (int i = 0; i < newArr.length ; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }
}
