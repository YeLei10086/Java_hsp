import java.util.Scanner;

public class 顺序查找 {

    public static void main(String[] args) {
        /**
         * 有一个数列：白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王
         * 	猜数游戏：从键盘中任意输入一个名称，判断数列中是否包含此名称【顺序查找】
         * 	要求: 如果找到了，就提示找到，并给出下标值。[两种方式]
         */

        String[] arr1 = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
        int index = -1;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查找的名字：");
        String name = sc.next();

        for (int i = 0; i < arr1.length; i++) {
            if (name.equals(arr1[i])){
                index = i;
                break;
            }
        }

        // 假设没找到
        if (index == -1){
            System.out.println("没有找到"+ name);
        }else {
            System.out.println("找到"+ name +",下标为" + index);
        }
    }
}
