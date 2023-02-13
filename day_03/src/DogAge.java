import java.util.Scanner;

/**
 * @Author YeLei
 * @Date 2022/10/15 12:35
 * @Version 1.0
 */
public class DogAge {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入狗的年龄（仅限数字）：");
        int dogAge = sc.nextInt();
        if (dogAge >= 0 && dogAge <= 2){
            System.out.println("狗的年龄是人类的" + dogAge * 10.5 + "岁");
        }else if (dogAge > 2){
            System.out.println("狗的年龄是人类的" + (2 * 10.5 + (dogAge - 2) * 4) + "岁");
        }else {
            System.out.println("输入不合法！");
        }
    }
}
