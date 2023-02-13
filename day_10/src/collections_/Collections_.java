package collections_;

import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author 叶磊
 */
public class Collections_ {
    public static void main(String[] args) {
        //测试 Collections 的常用方法
        ArrayList list = new ArrayList();
        list.add("tom");
        list.add("jack");
        list.add("marry");
        list.add("smith");
        list.add("tom");
        System.out.println(list);

        //reverse():反转 List 中元素的顺序
        Collections.reverse(list);
        System.out.println("反转 List = " + list);

        //shuffle():对 List 集合元素进行随机排序(每次的输出结果都不一样)
        Collections.shuffle(list);
        System.out.println("随机排序 = " + list);

        //sort():根据元素的自然顺序对指定的 List 集合元素按升序排序
        Collections.sort(list); //实际上是按照字符串大小来进行排序的
        System.out.println("按自然升序排序 = " + list);

        //当我们有其他需求时,比如 我们希望按照字符串的长度进行排序时,则可以使用这种指定排序方式的sort()
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //可以在此处加入校验代码
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        System.out.println("按字符串长度大小排序 = " + list);

        //swap():将指定 list 集合中的 i处元素 和 j处元素 进行交换
        Collections.swap(list,0,3);
        System.out.println("指定位置进行交换 = " + list);

        //Object max(Collections):根据元素的自然排序,返回给定集合中的最大元素
        System.out.println("按自然排序最大元素" + Collections.max(list));

        //Object max(Collection,Comparator):根据 Comparator 指定排序,返回给定集合中的最大元素
        //比如,我们需要返回长度最大的元素
        Object max = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        System.out.println("长度最大值的元素 = " + max);

        //Object min(Collections):根据元素的自然排序,返回给定集合中的最小元素

        //Object min(Collection,Comparator):根据 Comparator 指定排序,返回给定集合中的最小元素

        //int frequency(Collection,Object):返回指定集合中指定元素的出现次数
        System.out.println("tom 出现的次数 = " + Collections.frequency(list, "tom"));


        //void copy(List dest,List src):将src中的内容复制到dest中
        ArrayList list2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            list2.add("");
        }
        Collections.copy(list2,list);   //此处有坑 看源码
        System.out.println("拷贝后 = " + list2);

        //boolean replaceAll(List list,Object oldVal,Object newVal):使用新值替换 List 对象的所有旧值
        Collections.replaceAll(list,"tom","猪头");
        System.out.println("list 替换后 = " + list);
    }
}
