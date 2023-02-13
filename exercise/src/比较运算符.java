public class 比较运算符 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入任意秒：");
//        int seconds = sc.nextInt();
//
//        int hours = seconds/3600;   //任意秒中有多少小时
//        int minutes = seconds%3600/60;  //剩余多少分钟
//        int left_seconds = seconds%60;  //剩余多少秒
//        System.out.println("hours:"+hours+"\nminutes："+minutes+"\nleft_seconds："+left_seconds);



//        boolean a = true;
//        boolean b = false;
//        short z = 42;
//        if ((z++ == 42)&&(b == false))    z++;  //44
//        if ((a == false)||(++z == 45))    z++;  //46
//        System.out.println(z);

        //使用三元运算符比较三个数的最大值
        int a = 100;
        int b = 120;
        int c = 66;
        //效率高
        int max1 = a>b ? a:b;
        int max2 = max1>c ? max1:c;
//        int max = a>b ? (a>c ? a:c):(b>c ? b:c);  效率低
        System.out.println(max2);
    }
}
