import java.util.Scanner;

/**
 * @Author YeLei
 * @Date 2022/10/15 12:45
 * @Version 1.0
 */
public class Ifexcise {
    public static void main(String[] args) {

        while (true) {
            //1、产生随机两位数
            int i = (int) (Math.random() * 90 + 10);
            //得出十位
            i = 45;
            int random_shi = i / 10;
            //得出个位
            int random_ge = i % 10;

            //2、用户输入
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个两位数的数字：");
            int num = sc.nextInt();
            //得出十位
            int num_shi = num / 10;
            //得出个位
            int num_ge = num % 10;

            //全部匹配成功
            if (num == i) {
                System.out.println("奖励10000元");
            //全部匹配成功，但顺序变换
            } else if (random_shi == num_ge && random_ge == num_shi) {
                System.out.println("奖励3000元");
            //匹配成功其中一个，并且是按顺序匹配
            } else if (random_shi == num_shi || random_ge == num_ge) {
                System.out.println("奖励1000元");
            //匹配成功其中一个，不是按顺序匹配
            } else if (random_shi == num_ge || random_ge == num_shi) {
                System.out.println("奖励500元");
            } else {
                System.out.println("没有配匹到，作废！");
            }
            System.out.println("中将号码是：" + i);
        }
    }
}
