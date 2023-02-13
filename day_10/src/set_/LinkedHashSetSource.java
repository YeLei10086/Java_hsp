package set_;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author 叶磊
 */
public class LinkedHashSetSource {
    public static void main(String[] args) {
        //分析一下 LinkedHashSet 的底层机制
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(123);
        set.add(new Customer("猪头",1001));

        System.out.println(set);

        //解读：
        //1、LinkedHashSet 加入的顺序 和 取出的顺序是一致的
        //2、LinkedHashSet 底层维护的是一个LinkedHashMap（是HashMap的子类）
        //3、LinkedHashSet 底层结构（数组table + 双向链表）
        //4、添加第一次时,直接将table 表 扩容为16,存放的结点类型是 LinkedHashSet$LinkedEntrySet
        //5、数组是 HashMap$Node[] 存放的数据/元素 是 LinkedHashSet$LinkedEntrySet 类型,说明它们之间存在多态或者继承的关系
        /*
            源码：
                //继承关系是在内部类完成的
                static class Entry<K,V> extends HashMap.Node<K,V> { //Node是静态的（类名.属性）
                    Entry<K,V> before, after;
                    Entry(int hash, K key, V value, Node<K,V> next) {
                        super(hash, key, value, next);
                    }
                }
         */
    }
}

class Customer{
    private String name;
    private int num;

    public Customer(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "name=" + name + "num=" + num;
    }
}
