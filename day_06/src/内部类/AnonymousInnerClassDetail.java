package 内部类;

public class AnonymousInnerClassDetail {    //外部其他类
    public static void main(String[] args) {
        Outer02Detail outer02Detail = new Outer02Detail();
        outer02Detail.m1();
//        System.out.println("outer02Detail的hashcode = " + outer02Detail);
        //其他外部类-----不能访问-----> 匿名内部类(因为匿名内部类只是一个局部变量)

    }
}

class Outer02Detail{    //外部类
    private int n = 10;
    public void m1(){
        //匿名内部类的第一种调用方法
        //不能添加访问修饰符，因为它的地位就是一个局部变量  Person person = public new Person(){};  错误写法！
        //作用域：仅仅在定义它的方法或者代码块中
        Person person = new Person(){
             //如果匿名内部类中，没有重写父类的方法,默认调用的方法是父类的，与继承相关！
            @Override
            public void run() {
                System.out.println("①匿名内部类重写了run()方法 ：小鸟在飞...");
            }
        };
        person.run();   // 这里实行了动态绑定,实际上运行类型是 Outer02Detail$1
        System.out.println(person.getClass());

        //匿名内部类的第二种调用方法
        //匿名内部类本身也是返回对象
        // 还可以在重写的方法中写入参数
        new Person(){
            private int n = 100;
            @Override
            public void run() {
                //可以直接访问外部类的所有成员,包含私有的
                System.out.println("②匿名内部类重写了run()方法 ：小鸟在飞...  n = " + n);
            }

            @Override
            public void eat(String name) {
                super.eat(name);
                //如果外部类和匿名内部类的成员重名时，匿名内部类访问的话，默认遵循就近原则，
                //如果想访问外部类的成员,则可以使用 （外部类.this.成员） 去访问
                System.out.println("匿名内部类属性的n = " + n + "  外部类的属性n = " + Outer02Detail.this.n);
                //证明 Outer02Detail.this.n 是谁调用的！
                //Outer02Detail.this 就是谁调用 m1() 的对象
                System.out.println("Outer02Detail.this的hashcode = " + Outer02Detail.this);  //与主函数Main()中的hashcode值一模一样
            }
        }.eat("张三");
    }
}

class Person{
    public void run(){
        System.out.println("Person run...");
    }

    public void eat(String name){
        System.out.println("Person eat..." + name);
    }
}