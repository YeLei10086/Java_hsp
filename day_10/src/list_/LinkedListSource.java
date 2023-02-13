package list_;

import java.util.LinkedList;

/**
 * @author 叶磊
 */
public class LinkedListSource {
    public static void main(String[] args) {
        /**
         * LinkedList 的全面说明
         * 1、LinkedList底层实现了 双向链表 和 双端队列 特点
         * 2、可以添加任意元素（元素可重复）,包括null
         * 3、线程不安全,没有实现同步
         */

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);

        //删除一个结点
        linkedList.remove();    //默认删除第一个结点
        System.out.println(linkedList);
        //源码解读：
        /*
            1、LinkedList linkedList = new LinkedList();
                public LinkedList() {}
                这时 linkedList 的属性 first = null;   last = null;

            2、执行add()
                public boolean add(E e) {
                    linkLast(e);
                    return true;
                }

            3、将新的结点,加入到双向链表的最后
                void linkLast(E e) {
                    final Node<E> l = last;
                    final Node<E> newNode = new Node<>(l, e, null);
                    last = newNode;
                    if (l == null)
                        first = newNode;
                    else
                        l.next = newNode;
                    size++;
                    modCount++;
                }
         */
    }
}
