public class StringToBasicType {
    public static void main(String[] args) {

        String str1 = "12345.0";

        //将str --> double
        //方法
        //1. 使用 包装类 Double 有一个方法 parseDouble()
        //2. 返回 结果是double,对str1本身的值没有任何影响
        double d1 = Double.parseDouble(str1);

        //String 转 int
        String str2 = "100";
        int i = Integer.parseInt(str2);

        //String 转 float
        String str3 = "123.5";
        float f = Float.parseFloat(str3);
        System.out.println(f);

        String str4 = "尚硅谷";
//      str4 --> char => 理解成取出 字符串的第几位字符
        char ch = str4.charAt(1);
        System.out.println(ch);
    }

}
