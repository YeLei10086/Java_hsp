package list_;

import java.util.Vector;

/**
 * @author 叶磊
 */
public class VectorSource {
    public static void main(String[] args) {
        /**
         * Vector 线程是同步的,即线程安全
         * 如果使用的是无参构造器 , 默认长度为 10,满后,就按两倍扩容
         *
         * 如果使用的是有参构造器,长度为指定的大小,满后，就按两倍扩容
         */
//        Vector vector = new Vector();
        Vector vector = new Vector(11);
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }

        // 1.new Vector()底层 默认长度为10；
        /**
         *     public Vector() {
         *         this(10);
         *     }
         */

        //补充：有参构造器的底层   //长度为指定的有参构造器中的参数
        /**
         *     public Vector(int initialCapacity) {
         *         this(initialCapacity, 0);
         *     }
         */

        // 2.vector.add(i);
        //添加数据到vector集合
        /**
         *     public synchronized boolean add(E e) {
         *         modCount++;
         *         ensureCapacityHelper(elementCount + 1);
         *         elementData[elementCount++] = e;
         *         return true;
         *     }
         */
        //确定是否需要扩容
        /**
         *     private void ensureCapacityHelper(int minCapacity) {
         *         // overflow-conscious code
         *         if (minCapacity - elementData.length > 0)
         *             grow(minCapacity);
         *     }
         */

        //如果需要的数组大小 不够用 就扩容 (2倍扩容)
        //扩容的算法：
        // capacityIncrement 在源码中 = 0;
        // int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
        //                                 capacityIncrement : oldCapacity);
        /**
         *     private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
         *
         *     private void grow(int minCapacity) {
         *         // overflow-conscious code
         *         int oldCapacity = elementData.length;
         *         int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
         *                                          capacityIncrement : oldCapacity);
         *         if (newCapacity - minCapacity < 0)
         *             newCapacity = minCapacity;
         *         if (newCapacity - MAX_ARRAY_SIZE > 0)
         *             newCapacity = hugeCapacity(minCapacity);
         *         elementData = Arrays.copyOf(elementData, newCapacity);
         *     }
         */
    }
}
