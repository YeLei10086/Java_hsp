package map_;

import java.util.*;

/**
 * @author 叶磊
 */
public class MapFor_ {
    public static void main(String[] args) {
        //Map的遍历方式
        Map map = new HashMap();
        map.put("张三","12");
        map.put("张三","22");
        map.put("李四","17");
        map.put("王五","30");
        map.put("赵六","25");

        //第一种方式：先取出 所有的Key,通过Key 取出对应的Value
        //注意！这是keySet中 包含两种遍历方式
        Set keySet = map.keySet();
        //增强for循环
        System.out.println("=====keySet:第一种方式(1)=====");
        for (Object key : keySet) {
            System.out.println(key + " - " + map.get(key)); //map.get(key): the key whose associated value is to be returned
        }

        //Iterator迭代器
        System.out.println("=====keySet:第二种方式(2)=====");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key + " - " + map.get(key));
        }

        //第二种   通过 EntrySet 来获取 k-v
        Set entrySet = map.entrySet();  //本质上是把 EntrySet<Entry<K,V>> 中的 Entry<K,V> 取出来,因此要强转类型
        System.out.println("=====entrySet:第一种方式(3)=====");
        for (Object entry : entrySet) {
            //entry 转换 Map.Entry类型
            Map.Entry em = (Map.Entry) entry;
            System.out.println(em.getKey() + " - " + em.getValue());
        }

        System.out.println("=====entrySet:第二种方式(4)=====");
        Iterator iterator3 = entrySet.iterator();
        while (iterator3.hasNext()) {
            Object entry =  iterator3.next();
            //System.out.println(entry.getClass());   //HashMap$Node 类型
            //向下转型
            Map.Entry entry2 = (Map.Entry) entry;
            System.out.println(entry2.getKey() + " - " + entry2.getValue());
        }

        //第三种方式 把所有的values取出
        //注意！这里可以使用所有的 Collection 使用的遍历方法
        Collection values = map.values();
        System.out.println("=====values:第一种方式=====");
        for (Object value : values) {
            System.out.println(value);
        }

        System.out.println("=====values:第二种方式=====");
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Object value = iterator2.next();
            System.out.println(value);
        }
    }
}
