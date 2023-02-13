package list_;

/**
 * @author 叶磊
 */
public class Test {
    /**
     * 简单的双向链表测试
     * @param args
     */
    public static void main(String[] args) {
        Node zs = new Node("张三");
        Node ls = new Node("李四");
        Node ww = new Node("王五");

        // 张三 --> 李四 --> 王五
        zs.next = ls;
        ls.next = ww;
        // 王五 --> 李四 --> 张三
        ww.pre = ls;
        ls.pre = zs;

        Node first = zs;

        while (true){
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        Node zl = new Node("赵六");
        ls.pre = zl;
        zs.next = zl;
        zl.pre = zs;
        zl.next = ls;

        System.out.println();
        first = zs;
        while (true){
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        System.out.println();
        ls.pre = zs;
        zs.next = ls;
        ls.next = ww;
        ww.pre = ls;
        first = zs;
        while (true){
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
    }
}