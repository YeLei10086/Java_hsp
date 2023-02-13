package 小项目.oop_零钱通;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeOOP {
    Scanner sc = new Scanner(System.in);
    boolean flag = true;
    String key = "";
    //零钱通明细三种思路：
    // 1.用数组 2.用对象 3.用拼接
    String menu = "---------------零钱通明细---------------";  //使用最简单的拼接
    // 2.收益入账的思路：
    double money = 0.0;
    double balance = 0.0;
    Date date = new Date(); // 创建当前时间
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");    //进行时间格式转换
    // 3.消费
    String note = "";

    public void mainMenu(){
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
                    this.caidan();
                    System.out.println(menu);
                    break;
                case "2":
                    this.shouyi();
                    break;
                case "3":
                    this.xiaofei();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("输入的序号有误！");
            }

        }while (flag);
    }

    public void caidan(){
        System.out.println(menu);
    }

    public void shouyi(){
        System.out.print("入账金额：");
        money = sc.nextDouble();    // 入账金额
        //找出不正确的金额  然后给出提示  直接return
        if (money <= 0) {
            System.out.println("入账金额必须大于0 ！");
            return ;    //退出方法，不执行后面的代码
        }
        balance += money;   //余额
        menu += "\n入账金额\t+" + money + "\t\t" + sdf.format(date) + "\t余额：" + balance;
    }

    public void xiaofei(){
        System.out.print("消费原因：");
        note = sc.next();
        System.out.print("消费金额：");
        money = sc.nextDouble();
        if (money > balance || money <= 0 ) {
            System.out.println("消费金额应该在0-"+balance);
            return ;
        }
        balance -= money;
        menu += "\n" + note + "\t\t-" + money + "\t\t" + sdf.format(date) + "\t余额：" + balance;
        System.out.println("消费成功 ！" + "\t余额剩余：" + balance);
    }

    public void exit(){
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
    }
}
