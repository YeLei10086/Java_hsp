import java.util.Scanner;

public class 练习题2 {

    /**
     * 顺序排序
     * @param args
     */
    public static void main(String[] args) {
        String[] arr = {"AA","BB","CC","DD","AA"};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输出你要查找的单词：");
        String findName = sc.next();

        int[] manyIndex = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(findName.equals(arr[i])){
                manyIndex[count++] = i;
            }
        }

        if (count == 0){
            System.out.println("没有找到");
        }else{
            for (int i = 0; i < count; i++) {
                System.out.println("找到了，下标为" + manyIndex[i]);
            }
        }
    }
}
