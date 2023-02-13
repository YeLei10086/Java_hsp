public class Dome_03 {
    public static void main(String[] args) {
        //两个数进行交换的两种方法

        //第一种
        int a = 10;
        int b = 15;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a+",b = "+b);

        //第二种
        int c = 20;
        int d = 30;
        c = c + d;  //50
        d = c - d;  //50 - 30 = 20
        c = c - d;  //50 - 20 = 30
        System.out.println("c = "+c+",d = "+d);

    }
}
