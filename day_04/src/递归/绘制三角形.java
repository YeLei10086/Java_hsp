package 递归;

import java.util.Scanner;

/**
 * @Author YeLei
 * @Date 2022/08/23 15:02
 * @Version 1.0
 */
public class 绘制三角形 {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + "×" + i + "=" + j * i +"\t");
//            }
//            System.out.println();
//        }
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextLine()){
//            String input = sc.nextLine();
//            System.out.println(input);
//            boolean a = (input == "你好");
//            System.out.println(a);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生成绩：");
        int all = 0;
        int count = 0;
        while (sc.hasNext()){
            int score = sc.nextInt();
            if (score >= 0){
                count++;
                System.out.println("你已经输入的第"+count+"个学生的成绩是："+score);
                all += score;
                System.out.println("相加总分数是："+all);

                double avg = all / count;
                System.out.println("你输入的"+count+"个学生的平均成绩是"+avg);
            }else {
                return;
            }
            System.out.println("请输入学生成绩：");
        }
    }
}
