package final_;

public class Final01 {
    public static void main(String[] args) {
        //final类不能被继承，但是可以对象实例化
        A a = new A();
    }
}

//如果我们要求A类不能被其他类继承
//可以使用final关键字 进行修饰
//final类不能被继承，但是可以对象实例化
final class A{

}

//class B extends A{
//
//}
