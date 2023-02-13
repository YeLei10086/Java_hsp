public class 算数编程题 {
    public static void main(String[] args) {
//      案例：离放假还有97天，问合计XX星期XX天
        int day = 97;
        int week = day / 7;
        int day2 = day  % 7;
        System.out.println("第"+week+"个星期，第"+day2+"天");

//      案例：定义一个变量保存华氏温度，
//        华氏温度的转换公式为：5/9*（华氏温度-100）,
//        请求出华氏温度对应的摄氏度。
        double d1 = 234.5;
        // 转成5.0 否则会出问题
        double d2 = 5.0/9*(d1-100);
        System.out.println("华氏温度："+d1+",对应的摄氏温度为："+d2);
//      解决小数点过多的方案：格式化输出
        System.out.printf("华氏温度 %.2f 对应的摄氏温度 %.2f ",d1,d2);
    }
}
