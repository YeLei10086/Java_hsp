package homework.homework02;

import java.util.ArrayList;

/**
 * @author 叶磊
 */
public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Car("宝马",500000));
        list.add(new Car("奥迪",300000));
        list.add(new Car("奥拓",100000));
        list.add(new Car("奇瑞",50000));
        list.add(new Car("雪铁龙",150000));

        System.out.println("移除元素 = " + list.remove(2));

        ArrayList list2 = new ArrayList();
        list2.add(new Car("铁龙",150000));
        list2.add(new Car("AE86",350000));
        list.addAll(1,list2);
        System.out.println(list);

        System.out.println("元素是否为null = " + list.isEmpty());

        System.out.println("查找元素是否存在 = " + list.contains(list));   //比较的是地址，因此false

        System.out.println(list.containsAll(list2));

        System.out.println(list.removeAll(list2));
        System.out.println(list);

        System.out.println("遍历");
        for (Object object : list) {
            System.out.println(object);
        }
    }
}
