package stringbuffer_;

/**
 * @author 叶磊
 *
 * StringBuffer 是可变长度的
 * StringBuffer 是一个容器
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        // 1.StringBuffer 是 final类，不能被继承
        // 2.StringBuffer 的直接父类是 AbstractStringBuilder
        // 3.StringBuffer实现了 Serializable 接口（即StringBuffer对象可以进行串行化）,可以保存到文件，或进行网络传输
        // 4. 在父类中 AbstractStringBuilder 有一个属性是 char[] value，并且不是final类型的;
        // 该value[]数组 用于存放字符串内容，因此存放于堆中，而String类是存放于常量池中
        // 5.因为StringBuffer 字符内容存放在 char[] value,所以在变化(指增加或删除内容)，
        // 不用每次都更换地址(即不是每次都创建新的对象)，因此效率高于String.
    }
}
