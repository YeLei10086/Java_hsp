package annotation;

/**
 * @author 叶磊
 */
public class Override_ {
    public static void main(String[] args) {
        new B().run();
    }
}

class A{
    public void run(){};
}

/**
 * @Override  限定某个方法，是重写父类方法,该注解只能用于方法
 *
 * 补充说明：
 * @interface的说明
 * @interface 不是 interface,而是注解类,是jdk1.5之后加入的
 */
class B extends A{
    // 1、如果你写了@Override注解,编译器就会去检查该方法是否真的重写了父类的方法，如果的确重写了则编译通过，否则编译错误
    @Override   //限定某个方法，是重写父类方法,该注解只能用于方法
    public void run() {
        System.out.println("重写父类的run()方法");
    }
}