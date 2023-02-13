package list_;

/**
 * @author 叶磊
 */
public class LinkedList_01 {
    //实现一个简单的双向链表
    public static void main(String[] args) {

        Node yl = new Node("yl");
        Node hcy = new Node("hcy");
        Node zh = new Node("zh");

        //连接三个结点,形成双向链表
        //yl --> hcy --> zh
        yl.next = hcy;
        hcy.next = zh;
        //zh --> hcy --> yl
        zh.pre = hcy;
        hcy.pre = yl;

        Node first = yl;  //让first引用指向node,就是双向链表的头结点
        //遍历
        System.out.println("从头到尾链表输出");
        while (true){
            if (first == null){
                break;
            }
            System.out.println(first);  //先输出第一个节点
            first = first.next;
        }

        Node last = zh;  //让last引用指向node3,就是双向链表的尾结点
        //遍历
        System.out.println("从尾到头链表输出");
        while (true){
            if (last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }

        //演示链表的添加对象/数据
        //要求在hcy ---- zh 直接插入一个对象 tom
        //1、先创建一个 Node 结点， name就是tom
        Node tom = new Node("tom");
        tom.pre = hcy;
        tom.next = zh;
        zh.pre = tom;
        hcy.next = tom;

        first = yl;  //让first引用指向node,就是双向链表的头结点

        System.out.println("从头到尾链表输出");
        while (true){
            if (first == null){
                break;
            }
            System.out.println(first);  //先输出第一个节点
            first = first.next;
        }
    }
}

class Node{

    public Object item; //真正存放数据的地方
    public Node pre;    //指向下一个结点的
    public Node next;   //指向上一个结点的

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name = " + item;
    }
}