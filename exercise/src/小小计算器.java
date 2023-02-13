import java.util.Scanner;

public class 小小计算器 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = ' ';
        int n1 = 0;
        int n2 = 0;
        do {
            System.out.println("---------------小小计算器---------------");
            System.out.println("\t\t1.加法");
            System.out.println("\t\t2.减法");
            System.out.println("\t\t3.乘法");
            System.out.println("\t\t4.除法");
            System.out.println("\t\t0.退出");
            System.out.print("\t\t请选择：");
            choice = sc.next().charAt(0);
            switch (choice){
                case '1':
                    System.out.println("请输入第一个整数:");
                    n1 = sc.nextInt();
                    System.out.println("请输入第二个整数:");
                    n2 = sc.nextInt();
                    System.out.printf("%d + %d = %d\n",n1,n2,(n1+n2));
                    break;
                case '2':
                    System.out.println("请输入第一个整数:");
                    n1 = sc.nextInt();
                    System.out.println("请输入第二个整数:");
                    n2 = sc.nextInt();
                    System.out.printf("%d - %d = %d\n",n1,n2,(n1-n2));
                    break;
                case '3':
                    System.out.println("请输入第一个整数:");
                    n1 = sc.nextInt();
                    System.out.println("请输入第二个整数:");
                    n2 = sc.nextInt();
                    System.out.printf("%d * %d = %d\n",n1,n2,(n1*n2));
                    break;
                case '4':
                    System.out.println("请输入第一个整数:");
                    n1 = sc.nextInt();
                    System.out.println("请输入第二个整数:");
                    n2 = sc.nextInt();
                    System.out.printf("%d / %d = %d\n",n1,n2,(n1/n2));
                    break;
                case '0':
                    System.out.println("退出");
                    break;
            }
        }while (choice != '0');
    }
}
