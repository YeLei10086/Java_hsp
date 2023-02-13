package wrapper;

/**
 * @author 叶磊
 */
public class Integer01 {
    public static void main(String[] args) {
        // 演示int <--> Integer 的 装箱与拆箱
        // 1. jdk5.0 前是手动装箱与拆箱
        //手动装箱
        int n = 100;
        //两种装箱的方式
        Integer integer = new Integer(n);
        Integer integer1 = Integer.valueOf(n);
        //手动拆箱
        int i = integer.intValue();

        // jdk5.0 后,就可以自动装箱与拆箱
        //自动装箱
        int n2 = 100;
        Integer integer2 = n2;   //这里打断点，看底层，其实这里仍然是用了valueOf()方法，然后再new Integer，省去了我们自动装箱的环节
        //自动拆箱
        int n3 = integer2;  //这里打断点，看低层，其实这里仍然是用了intValue()方法，省去了我们自己拆箱的环节

        Float f = 1.5f;
    }
}
