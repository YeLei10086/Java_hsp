package 内部类;

public class InnerClass_01 {    //外部其他类
    public static void main(String[] args) {

    }
}

class Outer{    //外部类

    private String name;    //属性

    {
        System.out.println("代码块");  //代码块
    }

    public Outer(String name) { //构造器
        this.name = name;
    }

    public void run(){  //方法
        System.out.println("run...");
    }

    class Inner{    //内部类

    }
}

