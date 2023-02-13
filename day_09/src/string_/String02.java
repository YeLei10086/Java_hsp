package string_;

/**
 * @author 叶磊
 * 创建两种String对象的区别
 */
public class String02 {
    public static void main(String[] args) {

        /**
         * 方式一：
         *  先从常量池中查看是否有"张三"数据空间,
         *  如果有，直接指向，
         *  如果没有，则重新创建，然后指向。
         *  变量str最终指向的是常量池的空间地址。
         */
        String str = "张三";

        /**
         * 方式二：
         *  先在堆中创建空间，里面维护了一个value属性，指向常量池的"张三"空间。
         *  如果常量池中没有"张三",重新创建，
         *  如果有，直接通过value指向。
         *  最终指向的是堆中的空间地址。
         */
        String str2 = new String("张三");

    }
}
