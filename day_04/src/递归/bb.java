package 递归;

import java.util.Scanner;

public class bb {
    public static void main(String[] args) {
//        double[] d1 = {7,4,3,8,5};
//        double max = d1[0];
//        for (int i = 0; i <d1.length ; i++) {
//            if (max<d1[i]){
//                max = d1[i];
//            }
//        }
//        System.out.println(max);
//    }

        String[] str = {"aa","bb","cc","dd"};
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int index = -1;
        for (int i = 0; i < str.length; i++) {
            if (a.equals(str[i])) {
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("没有找到");
        }else{
            System.out.println("找到" + a + "下标为" + index);
        }
    }
}
