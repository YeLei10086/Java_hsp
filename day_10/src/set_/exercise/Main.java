package set_.exercise;

import java.util.HashSet;

/**
 * @author 叶磊
 */
public class Main {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("张三",5000,new MyDate(1998,3,21)));
        hashSet.add(new Employee("李四",5000,new MyDate(1999,10,18)));
        hashSet.add(new Employee("张三",5000,new MyDate(1998,3,21)));
        System.out.println(hashSet);
    }
}
