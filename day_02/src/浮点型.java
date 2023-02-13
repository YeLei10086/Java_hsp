public class 浮点型 {
    /**
     * 浮点型：
     *
     * @param args
     */
    public static void main(String[] args) {

//     1.默认使用double类型，如果要声明float型常量，须后加'f'或'F'
       float f1 = 0.618f;
        System.out.println(f1);

//      2.十进制数形式:如: 5.12  512.0f  .512    （必须要有小数点）
//        科学计数法形式: 如: 5.12e2 [5.12*10^2]  5.12E-2 [5.12/(10^2)]
        double d1 = .512;
        double d2 = 5.12E2;
        double d3 = 5.12E-2;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

//      3.通常情况下,应该使用double型,因为它比float更精确
        double d4 = 3.14159269527;
        float f2 = 3.14159269527f;
        System.out.println(d4+"\n"+f2);

//      4.浮点数使用陷阱：2.7 和 8.1/3 比较
        double d5 = 2.7;
        double d6 = 8.1/3;  //数学计算是2.7，但是在计算运算时，发生了精度损失2.69999999997
        System.out.println(d5);
        System.out.println(d6);

//      在开发中,如果需要比较两个小数是否相等，可以比较两个数的差值的绝对值，是否在某个精度范围
//        if (Math.abs(d5-d6) < 0.000001){
//            System.out.println("相等");
//        }
    }
}
