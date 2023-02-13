package map_;

import java.util.Hashtable;

/**
 * @author 叶磊
 */
public class HashTable_ {
    public static void main(String[] args) {
        //Hashtable 的 基本介绍
        //1、存放的元素是 键值对：k-v
        //2、Hashtable的键和值 都不能为null,否则会抛出 NullPointerException
        //3、Hashtable 是线程安全的 (方法中 synchronized 关键字),hashMap是线程不安全的
        //4、使用方法基本与hashMap一致

        Hashtable table = new Hashtable();
        table.put(1,"猪头");  //ok
        table.put(2,"狗头");  //ok
        //table.put(null,"老虎");   //异常 NullPointerException
        //table.put(4,null);  //异常 NullPointerException
        table.put(3,"兔子");  //ok
        table.put(4,"小猪头");

        table.put(5,"小猪头");
        table.put(6,"小猪头");
        table.put(7,"小猪头");
        table.put(8,"小猪头");
        table.put(9,"小猪头");
        table.put(10,"小猪头");
        table.put(11,"小猪头");
        System.out.println(table);

        //简单说明一下 Hashtable 底层
        //1、底层是数组,类型为 Hashtable$Entry[] ,第一次初始化大小为 11
        //2、threshold（即临界值为8） = 11 * 0.75;
        //3、按照自己的扩容机制来进行即可
        //4、执行 方法 addEntry(hash, key, value, index);  添加K-V 封装到addEntry
        //5、当 if (count >= threshold) 满足时,进行扩容
            // 扩容方式 ：int newCapacity = (oldCapacity << 1) + 1;  // 原来的2倍 + 1
    }
}
