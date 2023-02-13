package map_;

import java.util.Comparator;
import java.util.TreeMap;


/**
 * @author 叶磊
 */
public class TreeMap_ {
    public static void main(String[] args) {
        //1、当我们使用无参构造器,创建TreeSet时,它默认采用的是自然排序
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //下面是调用 String的compareTo方法 进行字符串大小的比较（从小到大排序）
//                return((String)o1).compareTo((String) o2);    //如果o1 compareTo o2 相减比较出的值为 0 ,则这个key不加入该元素,但进行了Value替换操作
                //String的compareTo方法 进行字符串长度的比较
                return ((String)o1).length() - ((String)o2).length();   //如果o1 - o2 长度为 0 ,则这个key不加入该元素，但进行了Value替换操作
            }
        });
        treeMap.put("tom","猪头");
        treeMap.put("jack","狗头");
        treeMap.put("marry","牛头");
        treeMap.put("smith","兔子");
        treeMap.put("tom","老虎");
        System.out.println(treeMap);

        /*
        源码解读：
            1、构造器把传入的比较器对象,赋给了底层的 TreeMap 的属性 this.comparator
                public TreeMap(Comparator<? super K> comparator) {
                    this.comparator = comparator;
                }

            2、调用put方法
            2.1 第一次添加 把k-v 封装到 Entry 对象中,放入root
                Entry<K,V> t = root;
                if (t == null) {
                    compare(key, key); // type (and possibly null) check

                    root = new Entry<>(key, value, null);
                    size = 1;
                    modCount++;
                    return null;
                }

           2.2 以后添加 走这里
                Comparator<? super K> cpr = comparator;
                if (cpr != null) {
                    do {    //遍历所有的key,给当前key找到适当的位置
                        parent = t;
                        //动态绑定到我们的匿名内部类的 compare 进行比较
                        cmp = cpr.compare(key, t.key);
                        if (cmp < 0)
                            t = t.left;
                        else if (cmp > 0)
                            t = t.right;
                        else    //如果遍历过程中，发现准备添加的key和当前已有的Key是相等的,就不添加了，但是会进行Value(值)的替换
                            return t.setValue(value);
                    } while (t != null);
               }

         */
    }
}
