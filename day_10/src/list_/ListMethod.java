package list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 叶磊
 */
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("李四");
        list.add("张三");
        //在index位置插入element元素（不加索引默认加到最后一个，加索引插入到对应索引位置）
        list.add(1,"赵六");
        System.out.println("list = " + list);

        List list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");
        //从index位置开始将elements中的所有元素添加进来
        list.addAll(2,list2);
        System.out.println(list);

        //获取指定index位置的元素
        System.out.println(list.get(3));

        //返回李四在集合中首次出现的位置
        System.out.println(list.indexOf("李四"));

        //返回李四在集合中最后一次出现的位置
        System.out.println(list.lastIndexOf("李四"));

        //移除指定index位置的元素,并返回此元素
        System.out.println(list.remove(2));
        System.out.println(list);

        //设置指定index位置的元素为element,相当于替换element
        list.set(1, "猪八戒");
        System.out.println(list);

        //返回从fromIndex到toIndex位置的子集合
        //返回的子集合，其实是[0，2）  包含0,不包含2的子集
        List returnList = list.subList(0, 2);
        System.out.println(returnList);
    }
}
