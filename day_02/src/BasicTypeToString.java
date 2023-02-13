public class BasicTypeToString {
    /**
     * 基本数据类型转String
     * @param args
     */
    public static void main(String[] args) {

        int num = 1;
        float f = 3.14f;
        boolean b = true;
        char ch = '男';

        //说明
        //1.num + "" 结果是String,并赋给str1变量
        //2.num本身不受影响
        String str1 = num + "";
        System.out.println(str1);

        String str2 = f + "";
        System.out.println(str2);

        String str3 = b + "";   // 输出"true"
        System.out.println(str3);

        String str4 = ch + "";  // 输出"男"
        System.out.println(str4);

        //举例说明
        System.out.println(str1 + "100");
        System.out.println(num + 100);
    }
}
