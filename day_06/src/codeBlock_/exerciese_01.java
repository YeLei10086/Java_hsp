package codeBlock_;

public class exerciese_01 {
    public static void main(String[] args) {
        System.out.println("n = " + AA.n);
        System.out.println("n = " + AA.n);
    }
}

class AA{
    public static int n;
    static {
        n = 100;
        System.out.println("我是一个静态代码块");
    }
}
