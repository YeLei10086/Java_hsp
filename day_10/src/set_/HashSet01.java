package set_;

import java.util.HashSet;

/**
 * @author 叶磊
 */

@SuppressWarnings({"all"})
public class HashSet01 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        //说明
        //1、在执行add方法后,会返回一个boolean值
        //2、如果添加成功,返回true,否则返回false
        //3、可以通过 remove 指定删除哪个对象
        System.out.println(hashSet.add("tom"));
        System.out.println(hashSet.add("jack"));
        System.out.println(hashSet.add("smith"));
        System.out.println(hashSet.add("jack"));
        System.out.println(hashSet.add("marry"));

        hashSet.remove("jack");
        System.out.println("hashSet = " + hashSet);

        //这里重置一下 变量 hashSet
        hashSet = new HashSet();
        hashSet.add("牛头");
        hashSet.add("牛头");
        hashSet.add(new Animal("狗头"));
        hashSet.add(new Animal("猪头"));
        System.out.println("重置后的hashSet = " + hashSet);

        //经典面试题
        //输出什么？
        hashSet.add(new String("晴空"));
        hashSet.add(new String("晴空"));
        System.out.println(hashSet);
    }
}

class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name=" + name;
    }
}