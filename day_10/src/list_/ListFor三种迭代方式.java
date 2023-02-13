package list_;

import java.util.*;

/**
 * @author 叶磊
 */
public class ListFor三种迭代方式 {
    public static void main(String[] args) {
        //List 接口的实现子类 Vector LinkedList
//        List list = new ArrayList();
//        List list = new Vector();
        List list = new LinkedList();
        list.add("tom");
        list.add("jack");
        list.add("猪头");
        list.add("晴天");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object =  iterator.next();
            System.out.println("iterator迭代 = " + object);
        }

        for (Object object : list) {
            System.out.println("foreach迭代 = " + object);
        }

        for (int i = 0; i < list.size(); i++) {
            Object object = list.get(i);
            System.out.println("for循环 = " + object);
        }
    }
}
