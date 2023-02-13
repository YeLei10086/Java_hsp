package codeBlock_;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();
    }
}

class AAA{

    /**
     * 父类的super() 是 object类  因此没有输出
     * 父类中没有代码块 因此没有输出
     */
    public AAA() {
        //① super() 隐藏了一个super
        //②调用普通代码块
        System.out.println("我的父类构造器！！！");//③最后执行
    }

}

class BBB extends AAA{

    {
        System.out.println("我是普通代码块！！！");
    }

    static {
        System.out.println("我是静态代码块！！！");
    }

    /**
     * 子类的super() 是 AAA类  因此输出：我的父类构造器！！！
     * 子类中有代码块 因此先输出：① 我是静态代码块！！！   ② 我是普通代码块！！！
     * 最后在执行：我是子类构造器
     */
    public BBB() {
        //① super() 隐藏了一个super
        //②调用普通代码块
        System.out.println("我是子类构造器");  //③最后执行
    }
}