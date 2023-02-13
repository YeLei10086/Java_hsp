package 递归;

import java.util.Scanner;

public class 斐波那契数列 {

    public static void main(String[] args) {

        T t = new T();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想得到的斐波那契数列：");
        int n = scanner.nextInt();
        if (n >= 1) {
            System.out.println("n = " + n + "的斐波那契数列是 = " + t.fibonacci(n));
        } else {
            System.out.println("输入的 n 必须>= 1");
        }

        System.out.println("请输入第几天：");
        int day = scanner.nextInt();
        int peachNum = t.peach(day);
        if (peachNum != -1){
            System.out.println("第"+ day + "天有" + peachNum +"个桃子");
        }else{
            System.out.println("天数不能为负数！");
        }
    }
}

class T{

    /**
     * 斐波那契数列
     * @param n
     * @return
     */
    public int fibonacci(int n){
       if (n == 1 || n == 2 ){
           return 1;
       }else{
           return fibonacci(n-1) + fibonacci(n-2);
       }
    }

    /**
     * 逆推：猴子吃桃问题
     * @param day
     * @return
     */
    public int peach(int day){
        if (day == 10){
            return 1;
        }else if (day >= 1 && day <= 9){
            return (peach(day + 1) + 1) * 2;
        }else{
            System.out.println("day 必须 在1 - 9之间");
            return -1;
        }
    }
}
