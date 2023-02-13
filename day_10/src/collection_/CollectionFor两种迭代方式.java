package collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 叶磊
 */
public class CollectionFor两种迭代方式 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(new Book("三国演义","罗贯中",20));
        collection.add(new Book("红楼梦","曹雪芹",25));
        collection.add(new Book("水浒传","施耐庵",20));

        //1.使用增强for循环,在Collection集合 （使用快捷键为 I）
        //2.增强for,底层其实仍然是 Iterator 迭代器(断点)
        //3.增强for可以理解成就是一个简化版的 迭代器遍历
        for (Object object:collection) {
            System.out.println(object);
        }

        //增强for循环,也可以作用在数组中使用
//        int[] nums = {1,8,10,90};
//        for (int n:nums) {
//            System.out.println(n);
//        }

    }
}
