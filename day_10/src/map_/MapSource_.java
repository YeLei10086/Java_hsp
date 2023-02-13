package map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 叶磊
 */
public class MapSource_ {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("No1","猪头");
        hashMap.put("No2","狗头");

        //1、 k-v 最后是 HashMap$Node node = newNode(hash, key, value, null);
        //2、 为了方便程序员的遍历，还会在底层创建一个 EntrySet集合 ,该集合存放的元素的类型是 Entry,
        //      而一个 Entry对象 里面就包含了Key-Value, 即 transient Set<Map.Entry<K,V>> entrySet;
        //3、 entrySet中,定义的类型是 Map.Entry，但实际上存放的还是 HashMap$Node 类型
        //      问：为什么 entrySet 定义的类型的 Map.Entry ,但返回的却是 HashMap$Node ？
        //      答：这是因为 HashMap$Node implements Map.Entry
        //4、 当把 HashMap$Node 对象 存放到 entrySet 就方便我们的遍历,因为 Map.Entry 提供了重要方法
        //      K getKey()  V getValue()

        Set set = hashMap.entrySet();
        System.out.println(set.getClass()); //HashMap$EntrySet
        for (Object object : set) {
            //System.out.println(object.getClass());  //HashMap$Node
            //为了从 HashMap$Node 取出 k-v
            //1、先做一个向下转型
            Map.Entry entry = (Map.Entry) object;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        Set set1 = hashMap.entrySet();
        Collection values = hashMap.values();
        System.out.println(set1.getClass());
        System.out.println(values.getClass());
    }
}
