package collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 叶磊
 */
public class CollectionMethod {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        // 添加单个元素
        list.add("yl");
        list.add(10);
        list.add(true);
        list.add('h');
        System.out.println("list = " + list);

        // 删除指定元素
//        list.remove(0); //删除下标是0的那个元素
        System.out.println(list.remove(true));
        System.out.println("list = " + list);

        // contains:查找元素是否存在
        System.out.println(list.contains("yl"));

        // size:获取元素个数
        System.out.println(list.size());

        // isEmpty:判断是否为null
        System.out.println(list.isEmpty());

        // clear:清空
//        list.clear();
//        System.out.println("list = " + list);

        // addAll:添加多个元素
        List list2  = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");
        list.addAll(list2);
        System.out.println(list);

        // containsAll:查找多个元素是否都存在
        System.out.println(list.containsAll((list2)));

        // removeAll:删除多个元素
        list.removeAll(list2);
        System.out.println(list);

    }
}
