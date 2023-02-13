package set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 叶磊
 */
public class TreeSet_ {
    public static void main(String[] args) {
        //解读 TreeSet ：
        //1、当我们使用无参构造器,创建TreeSet时,它默认采用的是自然排序
        //2、现在希望添加的元素,按照字符串大小来进行排序
        //3、使用TreeSet 提供的一个构造器,可以传入一个比较类（匿名内部类,并指定排序规则
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //下面是调用 String的compareTo方法 进行字符串大小的比较(从大到小排序)
                return((String)o2).compareTo((String) o1);    //如果o1 compareTo o2 相减比较出的值为 0 ,则这个key不加入
                //String的compareTo方法 进行字符串长度的比较
//                return ((String)o1).length() - ((String)o2).length();   //如果o1 - o2 长度为 0 ,则这个key不加入
            }
        });
        treeSet.add("tom");
        treeSet.add("jack");
        treeSet.add("marry");
        treeSet.add("smith");
        treeSet.add("tom");

        System.out.println(treeSet);

        /*
        底层源码解读：
            1、构造器把传入的比较器对象,赋给了 TreeSet 的底层的 TreeMap 的属性 this.comparator
                public TreeMap(Comparator<? super K> comparator) {
                    this.comparator = comparator;
                }

            2、在 调用 treeSet.add("tom")，在底层会执行到
                if (cpr != null) {  //这里的 cpr 就是我们的匿名内部类（对象）
                    do {
                        parent = t;
                        //动态绑定到我们的匿名内部类（对象）compare
                        cmp = cpr.compare(key, t.key);
                        //如果是比较字符串的大小,那么比较的是两个字符串的ASCII码进行相减操作,得出的数字
                        //如果是比较字符串的长度,那么比较的是两个字符串的长度进行相减操作.
                        //如果得出的数字 < 0,就加在左边
                        //如果长度 < 0,就加在左边
                        if (cmp < 0)
                            t = t.left;
                        //如果得出的数字 > 0,就加在左边
                        //如果长度 > 0,就加在右边
                        else if (cmp > 0)
                            t = t.right;
                        //如果得出的数字相等,即返回0,这个key就不加入了
                        //如果相减的长度相等,即返回0,这个key就不加入了
                        else
                            return t.setValue(value);
                    } while (t != null);
                }
         */
    }
}
