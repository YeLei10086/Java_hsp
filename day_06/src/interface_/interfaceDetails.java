package interface_;

public class interfaceDetails {
    public static void main(String[] args) {

        // 1、接口不能被实例化
//        new IA();

        // 举例说明第五点
//        System.out.println(IA.n);   // 静态的属性才可以用类名·静态属性或方法；
//        IA.n = 11;  // 这里报错。告诉我们它是一个final 关键字修饰的,不能对其进行修改。
    }
}

interface IA{

    // 5、接口中的属性，只能是 final ，而且是 public static final 修饰符
    int n = 10;     // 在这里，实际上等价于 public static final int n = 10; 只不过修饰符被隐藏了！！！

    // 2、 接口中所有的方法是 public 方法，接口中抽象方法，可以不用加 abstract 修饰
    void run();
}

// 6、接口不能继承其它的类,但是可以继承多个别的接口
interface IB extends IA{

    void jump();
}

// 7、接口的修饰符 只能是 public和默认, 这点和类的修饰符一样
interface IC{

}


class Cat implements IA{

    @Override
    public void run() {

    }
}

// 3、 抽象类去实现接口时,可以不实现接口的抽象方法
abstract class Dog implements IA{

}

// 4、 一个类可以实现多个接口
class Pig implements IA,IB{

    @Override
    public void run() {

    }

    @Override
    public void jump() {

    }
}