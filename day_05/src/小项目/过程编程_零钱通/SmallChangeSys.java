package 小项目.过程编程_零钱通;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {

    /**
     * // 化繁为简
     *  // 1.先完成显示菜单，并可以选择菜单，给出相应的提示
     *  // 2. 完成零钱通明细的设计
     *  // 3. 完成收益入账
     *  // 4. 完成消费
     *  // 5.退出
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String key = "";
        //零钱通明细三种思路：
        // 1.用数组 2.用对象 3.用拼接
        String pj = "---------------零钱通明细---------------";  //使用最简单的拼接
        // 2.收益入账的思路：
        double money = 0.0;
        double balance = 0.0;
        Date date = new Date(); // 创建当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");    //进行时间格式转换
        // 3.消费
        String name = "";

        do {
            System.out.println("\n---------------零钱通菜单---------------");
            System.out.println("\t\t\t 1 零钱通明细 \t\t\t");
            System.out.println("\t\t\t 2  收益入账 \t\t\t");
            System.out.println("\t\t\t 3 消     费 \t\t\t");
            System.out.println("\t\t\t 4 退     出 \t\t\t");

            System.out.print("请选择 (1-4):");
            key = sc.next();

            switch (key){
                case "1":
                    System.out.println(pj);
                    break;
                case "2":
                    System.out.print("入账金额：");
                    money = sc.nextDouble();    // 入账金额
                    if (money <= 0) {
                        System.out.println("入账金额必须大于0 ！");
                        break;
                    }
                    balance += money;   //余额
                    pj += "\n入账金额\t+" + money + "\t\t" + sdf.format(date) + "\t余额：" + balance;
                    break;
                case "3":
                    System.out.print("消费原因：");
                    name = sc.next();
                    System.out.print("消费金额：");
                    money = sc.nextDouble();
                    if (money > balance || money <= 0 ) {
                        System.out.println("消费金额应该在0-"+balance);
                        break;
                    }
                    balance -= money;
                    pj += "\n" + name + "\t\t-" + money + "\t\t" + sdf.format(date) + "\t余额：" + balance;
                    System.out.println("消费成功 ！" + "\t余额剩余：" + balance);
                    break;
                case "4":
                    /**
                     * 用户输入4时退出，给出提示确定要退出吗？ y/n,必须输入正确的y/n
                     * 否则 循环输出指令,直到输入 y/n
                     */
                    // 4.退出
                    String str = "";
                    while (true){
                        System.out.println("您确定要退出吗？请输入y/n退出：");
                        str = sc.next();
                        if (("y".equals(str)||"n".equals(str))){
                            break;
                        }
                    }
                    // 循环是循环  判断是判断  分层写逻辑  解耦
                    if (str.equals("y")){
                        flag = false;
                    }
                    break;
                default:
                    System.out.println("输入的序号有误！");
            }

        }while (flag);

        System.out.println("退出了零钱通程序。。。");
    }
}
