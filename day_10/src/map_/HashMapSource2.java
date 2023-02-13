package map_;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author 叶磊
 */
public class HashMapSource2 {
    public static void main(String[] args) {
        //模拟 HashMap 触发扩容、树化情况,并debug验证
        HashMap hashMap = new HashMap();
        //数组 --> 链表 -->  红黑树的扩容机制
        for (int i = 1; i <= 12; i++) {
            hashMap.put(new A(i),i);
        }
        System.out.println(hashMap);

        //table表的扩容机制
        for (int i = 0; i <= 128 ; i++) {
            hashMap.put(i,i);
        }
        System.out.println(hashMap);
    }
}

class A{
    private int num;

    public A(int num) {
        this.num = num;
    }

    //保证 hashCode 的值 统一
    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return "num=" + num;
    }
}
