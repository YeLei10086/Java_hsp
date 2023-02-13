package set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 叶磊
 */
public class SetMethod {
    public static void main(String[] args) {
        //1、以Set 接口的实现类 HashSet 来讲解 Set 接口的方法
        //2、set 接口对象,不能存放重复的元素，可以添加null,但是不能添加多个null
        //3、set 接口对象存放数据是无序的（即添加的顺序和取出的顺序不一致）
        //   注意：取出的顺序的顺序虽然不是添加的顺序,但它是固定的
        Set set = new HashSet();
        set.add("猪头");
        set.add("狗头");
        set.add("猪头");
        set.add("狗头");
        set.add("大黄");
        set.add("小黑");
        set.add(null);
        set.add(null);

        //验证每次的取出顺序是否真的一样   结论：一模一样
//        for (int i = 0; i < 10; i++) {
//            System.out.println(set);
//        }

        //Set 的两种 遍历方式：
        System.out.println("使用iterator迭代器输出");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object object =  iterator.next();
            System.out.print(object + "\t");
        }

        System.out.println("\n使用foreach输出");
        for (Object object : set) {
            System.out.print(object + "\t");
        }
    }
}
