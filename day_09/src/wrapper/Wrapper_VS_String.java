package wrapper;

/**
 * @author 叶磊
 * 包装类型和String类型的相互转换
 */
public class Wrapper_VS_String {
    public static void main(String[] args) {
        // Integer 与 String 的相互转换
        Integer i = 100;
        //第一种方式
        String s = i + "";
        //第二种方式
        String s2 = i.toString();
        //第三种方式
        String s3 = String.valueOf(i);

        //String -> 包装类(Integer)
        String str = "123";
        //第一种方式
        Integer i2 = new Integer(str);  //调用构造器
        //第二种方式
        Integer i3 = Integer.parseInt(str); //这里使用了自动装箱
    }
}
