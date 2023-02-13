import java.util.Scanner;

public class if多层嵌套 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        if (month>4 && month<10){
            if (age>=18 && age<60){
                System.out.println("票价：60");
            }else if (age < 18){
                System.out.println("票价30");
            }else if (age >= 60){
                System.out.println("票价20");
            }else {
                System.out.println("不存在");
            }
        }else{
            if (age >= 18 && age < 60) {
                System.out.println("票价：60");
            } else {
                System.out.println("票价20");
            }
        }
    }
}
