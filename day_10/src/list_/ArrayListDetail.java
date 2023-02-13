package list_;

import java.util.ArrayList;

/**
 * @author 叶磊
 */
public class ArrayListDetail {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        //1、ArrayList 可以加入null，并且是多个
        arrayList.add(null);
        arrayList.add("猪头");
        arrayList.add(null);
        System.out.println(arrayList);

        //2、ArrayList 是由数组来实现数据存储的

        //3、ArrayList 基本等同于 Vector, 除了ArrayList是线程不安全（但是执行效率高）
        /*
        源码： 没有 synchronized 关键字
            public boolean add(E e) {
                ensureCapacityInternal(size + 1);  // Increments modCount!!
                elementData[size++] = e;
                return true;
            }
        */

        //4、在多线程的情况下,不建议使用ArrayList
    }
}
