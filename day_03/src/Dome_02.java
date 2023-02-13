import java.util.Scanner;

public class Dome_02 {
    public static void main(String[] args) {
        //根据给出的秒数 打印输出XX小时XX分钟XX秒
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入任意秒：");
        int seconds = sc.nextInt();
        int hours = seconds/3600;  //有多少3600 就有多少个小时
        int minutes = seconds%3600/60; //不足3600的秒数,含有多少个60
        int left_seconds= seconds%60;  //不足60的秒数
        System.out.println(seconds+"秒中有:"+hours+"小时"+minutes+"分钟"+left_seconds+"秒");
    }
}
