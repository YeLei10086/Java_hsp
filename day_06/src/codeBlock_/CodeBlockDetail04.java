package codeBlock_;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        /**
         * 当创建子类对象(有继承关系时)
         * 执行顺序如下：
         * ① 先看 父类 是否有静态代码块和静态属性，有的话(优先级一样,按定义顺序执行)
         * ② 再看 子类 是否有静态代码块和静态属性，有的话(优先级一样,按定义顺序执行)
         * ③ 再看 父类 是否有普通代码块和普通属性，有的话(优先级一样,按定义顺序执行)
         * ④ 再看 父类 构造器
         * ⑤ 再看 子类 是否有普通代码块和普通属性，有的话(优先级一样,按定义顺序执行)
         * ⑥ 再看 子类 构造器
         */
        //说明下面这段代码：
        //1.首先进行了类的加载
        //1.1 先加载KKK(父类)
        //1.2 再加载CCC(子类)
        //2.创建对象
        //2.1 先从子类的构造器
        new FFF();

    }
}

class KKK{

    private static int n = getN();

    private int m = getM();

    {
        System.out.println("我是父类普通代码块！！！"); // （6）
    }

    static {
        System.out.println("我是父类静态代码块！！！");     // （2）
    }

    public static int getN(){
        System.out.println("父类的getN 被调用...");   // （1）
        return 100;
    }

    public int getM(){
        System.out.println("父类的getM 被调用..."); // （5）
        return 200;
    }

    /**
     * 父类的super() 是 object类  因此没有输出
     * 父类中没有代码块 因此没有输出
     */
    public KKK() {
        //① 隐藏了一个super()
        //② 隐藏了一个调用普通代码块
        System.out.println("我的父类构造器！！！");//③最后执行    // （7）
    }
}

class FFF extends KKK{

    private static int a = getA();

    private int b = getB();

    {
        System.out.println("我是子类普通代码块！！！"); // （9）
    }

    static {
        System.out.println("我是子类静态代码块！！！"); // （4）
    }

    public static int getA(){
        System.out.println("子类的getA 被调用...");   // （3）
        return 100;
    }

    public int getB(){
        System.out.println("子类的getB 被调用..."); // （8）
        return 200;
    }

    /**
     * 子类的super() 是 AAA类  因此输出：我的父类构造器！！！
     * 子类中有代码块 因此先输出：① 我是静态代码块！！！   ② 我是普通代码块！！！
     * 最后在执行：我是子类构造器
     */
    public FFF() {
        //① 隐藏了一个super()
        //② 隐藏了一个调用普通代码块
        System.out.println("我是子类构造器");  //③最后执行     // （10）
    }
}