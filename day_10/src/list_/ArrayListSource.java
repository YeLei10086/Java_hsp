package list_;

import java.util.ArrayList;

/**
 * @author 叶磊
 */
public class ArrayListSource {
    public static void main(String[] args) {
        /**
         * 当创建 ArrayList 对象时，如果使用的是无参构造器,则 初始elementData 容量为 0，
         * 第一次添加，则扩容 elementData = 10, 如需再次扩容,则扩容 elementData 为 1.5倍
         * 如果使用的是指定大小的构造器，则 初始elementData 容量为指定大小,如果需要扩容,则直接扩容 elementData 为 1.5倍
         */
        //使用无参构造器创建 ArrayList 对象
        ArrayList arrayList = new ArrayList();
//        ArrayList arrayList = new ArrayList(8);
        //使用for给arrayList集合添加1-10的数据
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        //使用for给arrayList集合添加11-15的数据
        for (int i = 11; i <= 15; i++) {
            arrayList.add(i);
        }

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add("猪头");
    }

    //结论
    //无参构造器是 直接比较是否为一个空数组，如果是，则第一次扩容为10，如果后面的长度不够用，往后按当前数组的1.5倍进行扩容

    /**
     *      private void grow(int minCapacity) {
     *         // overflow-conscious code
     *         int oldCapacity = elementData.length;
     *         int newCapacity = oldCapacity + (oldCapacity >> 1);
     *         if (newCapacity - minCapacity < 0)
     *             newCapacity = minCapacity;
     *         if (newCapacity - MAX_ARRAY_SIZE > 0)
     *             newCapacity = hugeCapacity(minCapacity);
     *         // minCapacity is usually close to size, so this is a win:
     *         elementData = Arrays.copyOf(elementData, newCapacity);
     *     }
     */

    //有参构造器是 比较是否大于0，大于就 new Object[initialCapacity]; 再根据参数是否够用进行1.5倍扩容

    /**
     *     public ArrayList(int initialCapacity) {
     *         if (initialCapacity > 0) {
     *             this.elementData = new Object[initialCapacity];
     *         } else if (initialCapacity == 0) {
     *             this.elementData = EMPTY_ELEMENTDATA;
     *         } else {
     *             throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
     *         }
     *     }
     */
}
