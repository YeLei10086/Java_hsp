package set_;

/**
 * @author 叶磊
 */

public class HashSetStructure {
    //模拟一个HashSet的底层 （实际上是讲 HashMap 的底层结构(数组 + 链表 + 红黑树)）
    public static void main(String[] args) {
        //模拟一个简单的数组 + 链表结构
        //1、创建一个数组,数组的类型为 Node[]
        //2、有些人,直接把 Node[] 数组 称为 表
        Node[] table = new Node[16];
        //直接创建结点
        Node jack = new Node("jack", null);
        table[2] = jack;    //把jack 放在 索引为2的位置
        Node tom = new Node("tom", null);
        jack.next = tom;    //把tom 挂载到 jack的结点后面
        Node rose = new Node("rose", null);
        tom.next = rose;    //把rose 挂载到 tom的结点后面

        Node pig = new Node("pig", null);
        table[3] = pig;     //把pig 放在索引为3的位置
        System.out.println(table);
    }
}

class Node{ //结点,存储数据,可以指向下一个结点,从而形成链表

    Object item;    //存放数据
    Node next;  //指向下一个结点

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
