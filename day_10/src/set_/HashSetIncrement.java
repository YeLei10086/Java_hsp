package set_;

import java.util.HashSet;

/**
 * @author 叶磊
 */
public class HashSetIncrement {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        /**
         * 1、HashSet 底层是 HashMap，第一次添加时,table数组扩容到16,临界值(threshold) = 16 * 加载因子(loadFactor) 0.75 = 12;
         * 2、如果table数组使用到了临界值12,就会扩容到 16*2 = 32, 新的临界值 = 32 * 0.75 = 24, 以此类推
         */
        //断点看扩容机制
//        for (int i = 0; i < 100; i++) {
//            hashSet.add(i);
//        }

        /**
         * 3、在Java8中,如果一条链表的元素个数到达 TREEIFY_THRESHOLD (源码 默认 = 8),
         *      并且table的大小 >= MIN_TREEIFY_CAPACITY (源码 默认 = 64),就会进行树化(红黑树),否则仍然采取数组扩容机制
         */
        for (int i = 1; i <= 12; i++) {
            hashSet.add(new A(i));
        }
    }
}

class A{
    public int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        //固定hash值，进行链表
        return 100;
    }
}