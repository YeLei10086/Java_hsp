package enum_;

/**
 * @author 叶磊
 */
public class EnumDetail {
    public static void main(String[] args) {
        Active.PERSON.run();    //调用方式：枚举类.定义的枚举.对应的方法
    }
}

class A{}

interface IA{
    public void run();
}

interface IB{
    public void jump();
}

// 1、使用enum关键字后，就不能再继承其它类了，因为enum会隐式继承Enum,而Java是单继承机制的。
//enum Season extends A{}   错误写法,Java是单继承机制，这里的Season隐式继承了Enum类
// 2、枚举类和普通类一样,可以实现接口
enum Active implements IA,IB{
    /**
     *  一个人
     */
    PERSON;

    @Override
    public void run() {
        System.out.println("run....");
    }

    @Override
    public void jump() {
        System.out.println("jump...");
    }
}