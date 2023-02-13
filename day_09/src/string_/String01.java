package string_;


/**
 * @author 叶磊
 */
public class String01 {
    public static void main(String[] args) {
        // 1.String 对象用于保存字符串,也就是一组字符序列。
        // 2.字符串常量对象是用双引号括起来的字符序列。  例如："张山"
        // 3.字符串的字符使用Unicode字符编码,一个字符(不区分是字符还是汉字)占两个字节  例如：char也是占两个字节
        // 4.String类较常用构造器：
//        String s1 = new String();
//        String s2 = new String(String original);
//        String s3 = new String(char[] a);
//        String s4 = new String(char[] a,int startIndex,int count);
//        String s5 = new String(byte[] b);

        // 5.String 实现了 Serializable接口, 说明String 可以【串行化】(可以在网络中传输)
        //   String 实现了 Comparable接口,   说明String 对象可以相互比较大小
        // 6.String 是一个 final类，不能被其它类继承
        // 7.String 有一个属性 private final char value[]; 用于存放字符串内容
        // 8.一定要注意 7. 中的 value 是一个final类型的,一旦被赋值以后，就不可修改(指的是value的地址不可修改),
        // 即 value 不能指向一个新的地址, 但是value数组中的单个字符是允许更改的
//        final char value[] = {'t','o','m'};
//        value[0] = 'T';     //数组中的单个字符更改是允许的
//        char value2[] = {'y','l'};
//        value = value2; //这种方式是不允许的,因为value的地址被更改了

    }
}
