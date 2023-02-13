package interface_;

/**
 *  小结：
 *      1、在interface中,方法有三种写法：
 *          ①抽象方法     ②默认实现方法     ③静态方法
 *      2、在jdk7.0前,接口里的所有方法都没有方法体,即都是抽象方法。
 *      3、在jdk8.0后,接口可以有静态方法，默认方法，也就是说接口中可以有方法的具体实现。
 */
public interface interface_02 {
    // 可以写属性
    public int n = 10;

    // 可以写方法
    // 在接口中，抽象方法，可以省略abstract关键字
    public void hi();

    // 在jdk8以后(包括jdk8),可以有默认实现方法，需要使用 default 关键字修饰
    default public void  ok(){
        System.out.println("ok()...");
    }

    // 在jdk8以后(包括jdk8),可以有静态实现方法，需要使用 static 关键字修饰
    public static void run(){
        System.out.println("run()...");
    }
}
