package 内部类;

/**
 * 演示匿名内部类的使用
 */
public class AnonymousInner {   // 外部其它类
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.method();
    }
}

class Outer02{  //外部类
    private int n = 10;
    public void method(){
        //传统写法
        // 1、需求： 想使用一个IA的接口,并创建对象
        // 2、传统方式：写一个类，创建该接口，并创建对象
        // 3、现需求是 Dog类只是使用一次，后面再也不使用了
        // 4、可以使用匿名内部类来简化开发
        // 5、tiger的编译类型？     接口类: IA
        // 6、tiger的运行类型？     匿名内部类,类名由系统分配：Outer02$1
        // 7、jdk底层在创建匿名内部类 Outer02$1的同时 , 马上创建了 Outer02$1实例，并且把地址返回给了 tiger (解读25行)
        // 8、 匿名内部类使用一次，就不能在使用了；    注意！这里指的不是tiger对象，而是匿名内部类
        /*
            class Outer02$1 implements IA{
                @Override
                public void run() {
                    System.out.println("老虎在奔跑...");
                }
            }
         */
        IA tiger = new IA(){
            @Override
            public void run() {
                System.out.println("老虎在奔跑...");
            }
        };
        System.out.println(tiger.getClass());   // class 内部类.Outer02$1 这个带$的这一串  就是系统底层给我们默认分配的匿名内部类
        tiger.run();

        // 演示基于类的匿名内部类
        //分析：
        // 1、编译类型： Father
        // 2、运行类型： 匿名内部类的形式 Outer02$2
        // 3、底层会创建匿名内部类
        /*
            class Outer02$ extend Father(){
                @Override
                public void test() {
                    System.out.println("匿名内部类重写了test()方法");
                }
            }

         */
        // 4、同时也直接返回了 匿名内部类 Outer02$2 的对象
        // 5、匿名内部类的形参列表("jack")  会去调用Father中的构造器
        Father father = new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test()方法");
            }
        };
        System.out.println(father.getClass());  // class 内部类.Outer02$2
        father.test();

        //基于抽象类的匿名内部类
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("兔子吃萝卜...");
            }
        };
        System.out.println(animal.getClass());
        animal.eat();
    }
}

interface IA{
    public void run();
}

//class Dog implements IA{
//
//    @Override
//    public void run() {
//        System.out.println("小狗在奔跑...");
//    }
//}

class Father{
    public Father(String name) {
        System.out.println("Father 构造器被调用了..." + name);
    }

    public void test(){

    }
}

abstract class Animal{
    abstract void eat();
}