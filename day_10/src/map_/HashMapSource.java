package map_;

import java.util.HashMap;

/**
 * @author 叶磊
 */
public class HashMapSource {
    public static void main(String[] args) {
        //扩容机制【与 HashSet 相同】
        //1、HashMap 底层维护了 Node类型的数组(即table表),默认为null
        //2、创建对象时,将加载因子(loadFactor) 初始化为:0.75
        //3、当添加 key-value 时,通过key的哈希值得到在table的索引。
        //     然后判断该索引处是否有元素,
        //     如果没有该元素,直接添加。
        //     如果该索引处有元素,继续判断该元素的key是否和准备加入的key相等,
        //     如果相等,则直接替换 value
        //4、第一次添加,则需要 扩容table 容量为 16 , 临界值为 12
        //5、以后再扩容,则需要 扩容table容量 为 原来的2倍(即32) ,临界值为 原来的两倍(即24),以此类推。
        //6、在 Java8中,如果一条链表的元素个数超过 TREEIFY_THRESHOLD(默认值为8),
        //      并且table的大小 >= MIN_TREEIFY_CAPACITY(默认值为64),就会进行树化(红黑树)。
        HashMap hashMap = new HashMap();
        hashMap.put("1","猪头");
        hashMap.put("2","狗头");
        hashMap.put("1","兔子");

        System.out.println(hashMap);

        /*
        解读 HashMap 的源码：
            1、执行构造器 new HashMap()
               初始化加载因子 this.loadFactor = DEFAULT_LOAD_FACTOR;  loadFactor = 0.75;
               HashMap$Node[] table = null;
            2、执行 put() 调用 hash方法,计算 key的 hash值（h = key.hashCode()) ^ (h >>> 16）
                public V put(K key, V value) {
                    return putVal(hash(key), key, value, false, true);
                }
            3、执行 putVal() 方法
                final V putVal(int hash, K key, V value, boolean onlyIfAbsent,boolean evict) {
                    Node<K,V>[] tab; Node<K,V> p; int n, i; //定义辅助变量
                    //如果底层的table 数组为null 或者 length = 0,就扩容到16
                    if ((tab = table) == null || (n = tab.length) == 0)
                        n = (tab = resize()).length;
                    //取出 hash值 对应的 table的索引位置的Node,如果为null,就直接加入k-v
                    //创建一个Node,加入该位置
                    if ((p = tab[i = (n - 1) & hash]) == null)
                        tab[i] = newNode(hash, key, value, null);
                    else {
                        Node<K,V> e; K k;   //定义辅助变量
                        //如果table表的索引位置的key的hash值与新的key的hash值相同,
                        //并且存在的现有结点的key和准备添加的key是同一个对象,
                        //或者equals返回true,就认为不能加入新的key-value
                        if (p.hash == hash &&
                            ((k = p.key) == key || (key != null && key.equals(k))))
                            e = p;
                        //如果当前的table的已有Node,已经是红黑树了,就按照红黑树的方式处理
                        else if (p instanceof TreeNode)
                            e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                        else {
                            //如果找到的结点,后面是链表,就循环比较
                            for (int binCount = 0; ; ++binCount) {  //死循环
                                if ((e = p.next) == null) {     //如果整个链表没有和它相同的值,就加入到该链表的最后
                                    p.next = newNode(hash, key, value, null);
                                    //加入后,判断当前链表的个数,是否已经到达8个,到8个后,
                                    //就调用 treeifyBin() 进行树化
                                    if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                        treeifyBin(tab, hash);
                                    break;
                                }
                                //如果在循环链表的比较中,发现有相同的值,就break(即不添加该key,只是替换存在该key的value)
                                if (e.hash == hash &&
                                    ((k = e.key) == key || (key != null && key.equals(k))))
                                    break;
                                p = e;
                            }
                        }
                        if (e != null) { // existing mapping for key
                            V oldValue = e.value;
                            if (!onlyIfAbsent || oldValue == null)
                                e.value = value;    //替换key 对应的 value
                            afterNodeAccess(e);
                            return oldValue;
                        }
                    }
                    //每增加一个Node结点,就size++
                    ++modCount;
                    //如果size > 临界值,就扩容
                    if (++size > threshold)
                        resize();
                    afterNodeInsertion(evict);
                    return null;
                }

            4、关于树化(转换成红黑树)
            //如果table表 为 null 或者 大小还没有到64,暂时不树化,而是进行扩容
            //否则才会真正的树化
            final void treeifyBin(Node<K,V>[] tab, int hash) {
                int n, index; Node<K,V> e;
                if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
                    resize();
            }
         */
    }
}
