package codeBlock_;

public class CodeBlockDetail02 {

    public static void main(String[] args) {
        new A();    //(1)getN 被调用...   (2) A 的静态代码块被执行...     (3)getN2 被调用...     (4) A 的普通代码块被执行...
    }
}

class A{
    /**
     *  静态成员优先级 高于  普通成员优先级
     *
     *  静态代码块 和 静态成员  输出优先级相等;
     *  要看静态成员代码执行顺序   谁在前面  先输出谁
     *  普通成员也以此类推,但是静态成员和静态代码块的优先级均高于普通成员和普通代码块，
     *  因此有静态成员和静态代码块时，优先执行静态的
     *  最后：
     *      构造器的优先级  均低于静态代码块、静态成员和普通代码块、普通成员
     */
    private int n2 = getN2();
    {
        System.out.println(" A 的普通代码块被执行...");
    }

    //静态属性初始化
    private static  int n = getN();
    static {
        System.out.println(" A 的静态代码块被执行...");
    }

    public static int getN(){
        System.out.println("getN 被调用...");
        return 100;
    }

    public int getN2(){
        System.out.println("getN2 被调用...");
        return 200;
    }

    public A() {
        System.out.println(" A 的无参构造器被调用...");
    }
}