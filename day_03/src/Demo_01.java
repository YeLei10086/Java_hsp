import java.util.Scanner;

public class Demo_01 {
    /**
     * 定义两个变量，分别保存键盘输入的两个整数，实现加减乘除
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();

        System.out.println(num1 +"+"+ num2+"="+(num1+num2));
        System.out.println(num1 +"-"+ num2+"="+(num1-num2));
        System.out.println(num1 +"*"+ num2+"="+(num1*num2));
        System.out.println(num1 +"/"+ num2+"="+(num1/num2));

    }
}
