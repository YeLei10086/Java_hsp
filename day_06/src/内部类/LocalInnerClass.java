package 内部类;

/**
 * 演示局部内部类的使用
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer01 outer1 = new Outer01();
        outer1.m1();
        //为了印证 细节7
        System.out.println("outer2的hashCode = " + outer1);
    }
}

class Outer01{   //外部类
    private int  n = 10;    //私有属性
    private void m2(){  //私有方法
        System.out.println("我是一个私有的方法");
    }

    public void m1(){   //方法
        // 1、局部内部类是定义在 外部类的局部位置 ，通常在 方法 中
        // 3、局部内部类 不能添加访问修饰符 ,但是可以使用 final 修饰，
        // 如果使用 final 修饰，则该内部类不能被其它类继承！
        // 4、局部内部类的作用域： 仅仅在定义它的 方法 或 代码块 中
        final class Inner02{  //局部内部类（本质仍然一个类）
            private int n = 100;
            // 2、可以直接访问外部类的所有成员,包括私有的
            public void f1(){
                // 5、 局部内部类可以直接访问外部类的成员，比如下面：   外部类的属性 n 和 方法 m2()
                // 7、 如果外部类和局部内部类的成员重名时,默认遵循就近原则，
                //  如果想访问外部类的成员,使用（外部类名·this·成员） 去访问
                // 解读第34、35行代码：
                //  Outer2.this 本质就是外部类的对象，即哪个对象调用了m1(), Outer2.this就是哪个对象
                System.out.println("局部内部类的n = " + n + "  外部类的n = " +  Outer01.this.n);
                System.out.println("Outer2.this hashcode = " + Outer01.this);
                m2();
            }
        }
        // 6、外部类在方法中，可以创建Inner02对象，然后调用方法即可

        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}