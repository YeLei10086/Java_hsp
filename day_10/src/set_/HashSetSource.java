package set_;

/**
 * @author 叶磊
 */

import java.util.HashSet;

/**
 * 分析HashSet的添加元素底层是如何实现 (hash() + equals())
 */
public class HashSetSource {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println(hashSet);

        /*
        源码分析：
            1、执行 HashSet(),无参构造器
            public HashSet() {
                map = new HashMap<>();
            }

            2、执行 add()
                public boolean add(E e) {
                    return map.put(e, PRESENT)==null;   //private static final Object PRESENT = new Object();
                }

            3、执行 put(),该方法会执行 hash(key) 得到key对应的hash值,但是hash值 并不是完全等于 hashcode的
                public V put(K key, V value) {  //这里的V value 实际上是 PRESENT
                    return putVal(hash(key), key, value, false, true);
                }

            4、执行hash(key)
                static final int hash(Object key) {
                    int h;
                    return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
                }

            5、执行 putVal()
            final V putVal(int hash, K key, V value, boolean onlyIfAbsent,boolean evict) {
                Node<K,V>[] tab; Node<K,V> p; int n, i;     //定义的辅助变量
                //tab 就是 HashMap 的一个属性,类型是 Node[] 数组
                //if 语句表示如果当前 table 是 null,或者 大小 = 0
                if ((tab = table) == null || (n = tab.length) == 0)
                    //第一次扩容 , 大小为 [16] 个空间
                    n = (tab = resize()).length;
                //(1)根据key,得到hash值 去计算该key 应该存放到table表的哪个索引位置,并且把这个位置的对象,赋给 辅助变量 p
                //(2)判断 p 是否为 null
                //(2.1) 如果p 为 null,表示还没有存放元素,就创建一个Node(key = "java" value = "PRESENT")
                //(2.2)放在该位置 tab[i] = newNode(hash, key, value, null);
                if ((p = tab[i = (n - 1) & hash]) == null)
                    tab[i] = newNode(hash, key, value, null);
                else {
                    Node<K,V> e; K k;   //定义的辅助变量
                    //如果当前索引位置对应的链表的第一个元素和准备添加的key的hash值相等
                    //并且满足下面两个条件之一 :
                    //(1)准备加入的key 和 p 指向的Node结点的key 是同一个对象
                    //(2)或者 p 指向的key的 equals() 与 准备加入的key 比较后 相等
                    //就不能加入
                    if (p.hash == hash &&
                        ((k = p.key) == key || (key != null && key.equals(k))))
                        e = p;
                    //再判断 p 是不是 一棵红黑树
                    //如果是一棵红黑树,就调用 putTreeVal(),来进行添加操作
                    else if (p instanceof TreeNode)
                        e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                    else {  //如果table对应索引位置,已经是一个链表,就使用for循环比较
                    //(1) 依次和该链表的每一个元素比较后,都不相同,则挂载到该链表的最后
                        for (int binCount = 0; ; ++binCount) {
                            if ((e = p.next) == null) {
                                p.next = newNode(hash, key, value, null);
                                // 注意！在把元素添加到链表后,立即判断，该链表是否已经有8个结点，
                                // 有,就调用 treeifyBin() 对当前这个链表进行树化 (即转成红黑树)
                                if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                    treeifyBin(tab, hash);
                                break;
                                // 注意！这里进入到 treeifyBin() 之后,还要进行一个判断,
                                //如果 该table 表长度 == null 或者 table 表长度 < 64
                                if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
                                resize();
                                //如果上面这个if语句成立,则先把该table表进行扩容
                                //如果上面这个if语句不成立,则把链表转化为红黑树
                            }
                            //(2)依次和该链表的每一个元素比较过程中,如果有相同的情况,就直接break
                            if (e.hash == hash &&
                                ((k = e.key) == key || (key != null && key.equals(k))))
                                break;
                            p = e;
                        }
                    }
                    if (e != null) { // existing mapping for key
                        V oldValue = e.value;
                        if (!onlyIfAbsent || oldValue == null)
                            e.value = value;
                        afterNodeAccess(e);
                        return oldValue;
                    }
                }
                ++modCount;
                //判断当前table的大小 是否 > 临界值 12
                // size 就是我们每加入一个结点 Node(hash,key,value,next),size就++
                //意思就是,无论你是在table表加入一个key,还是table表中某个子结点的链表中添加了key ,它都会进行 ++size
                if (++size > threshold)
                    resize();   //进行扩容
                afterNodeInsertion(evict);
                return null;    //返回null表示成功
            }
         */
    }
}
