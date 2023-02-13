import java.util.Scanner;

public class OOPTest {

    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.speak();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个数字：");
//        int num = sc.nextInt();
//        cat.chuanCan(num);  //实参
        cat.chuanCan(100);

        cat.getSum(1,1);


    }
}

class Cat{
    String name;
    int age;
    String color;

    public void speak(){
        System.out.println("我是一只猫猫！");
    }

    //传递一个参数
    //添加 传参成员方法，该方法可以接收一个数n,计算从 1+...+n 的结果
    public void chuanCan(int n){    //形参
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            sum += i;
        }
        System.out.println("sum=" + sum);
    }

    //传递二个参数
    public void getSum(int n1,int n2){
        int sum = n1 + n2;
        System.out.println("和="+ sum);
    }



}