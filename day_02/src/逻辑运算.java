public class 逻辑运算 {
    public static void main(String[] args) {

        /**
         *  &&短路与 和 &逻辑与 的使用区别：
         *
         *      1.&&(短路与)：如果第一个条件为false,则第二个调剂不会进行判断，最终结果返回false,效率高。
         *      2.&(逻辑与)：不管第一个条件是否为false,第二个条件都会继续判断,效率低。
         *
         */
        //举例说明：
        int a = 100;
        int b = 9;
        if (a < 10 && ++b > 15){
            System.out.println("ok");
        }
        System.out.println("a = "+a+",b="+b);

        int c = 100;
        int d = 9;
        if (c < 10 & ++d > 15){     // c = 100, c<10 为false ,不该执行++b的操作，但是它执行了
            System.out.println("ok");
        }
        System.out.println("c = "+c+",d="+d);

        //将String类型的值转换成double
        String str = "11";
        double d1 = Double.parseDouble(str);
        System.out.println(d1);

        //将char型的值转换成String
        char  ch = '男';
        String ab = ch+"";
        System.out.println(ab);
    }
}
