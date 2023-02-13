package 内部类.InnerClassExercise;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        //第一种写法：当作实参直接传递,简介高效
        //这种写法适合只使用一次这个匿名内部类的时候用，意思就是我以后基本上不可能用到这个类了
        f1(new IA() {
            @Override
            public void show() {
                System.out.println("这是一副世界名画...");
            }
        });

        //第二种：传统写法
        //1、首先先定义一个类 继承 接口
        //2、缺陷：如果这个类我们只使用一次，那么这样定义一个Picture类是不值得的,但是如果我们需要频繁的使用这个picture类,那么这样写是没有问题的
        f1(new Picture());
    }

    //静态方法，形参是接口类型
    public static void f1(IA ia){

    }
}

interface IA{
    void show();
}

// 类 --> 实现IA => 编程领域(称之为硬编码)
class Picture implements IA{

    @Override
    public void show() {
        System.out.println("这是一副世界名画...");
    }
}