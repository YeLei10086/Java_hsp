import java.util.Scanner;

public class while循环 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String xm = sc.next();
        while (!"exit".equals(xm)){
            System.out.println("请输入姓名:");
            xm = sc.next();
        }
        System.out.println("程序结束!");

        // 1-100 被3整除
        int i = 1;
        while (i<=100){
            if (i%3==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

