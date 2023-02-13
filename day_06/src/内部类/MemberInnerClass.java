package 内部类;

/**
 * 成员内部类
 */
public class MemberInnerClass {
    public static void main(String[] args) {
        Outer03 outer03 = new Outer03();
        outer03.test();

        //6、外部其他类，使用成员内部类的两种方式：
        //第一种
        Outer03.Inner03 inner03 = outer03.new Inner03();    //外部类 new 成员内部类,相当于把new Inner03()当作outer03的成员
        inner03.say();
        //第二种
        //在外部类中,编写一个方法,可以返回 Inner03对象
        Outer03.Inner03 inner03Instance = outer03.getInner03Instance();
        inner03Instance.say();
    }
}

//3、作用域：和外部类的其他成员一样,为整个类体
class Outer03{  //外部类
    private int n = 10;
    public String name = "张三";
    private void m1(){
        System.out.println("我是一个私有方法");
    }

    /*
    成员内部类是定义在外部类的成员位置，并且没有static修饰的
     */
    // 2、可以添加任意修饰符(public、protected、默认、private),因为它的地位就是一个成员
    public class Inner03{  //成员内部类
        private int sal = 0;
        private int n = 100;
        public void say(){
            // 1、可以直接访问外部类的所有成员，包含私有的
            // 4、成员内部类--可以直接访问-->外部类成员
            // 7、如果外部类和内部类重名时，内部类访问的话，默认遵循就近原则，如果想访问外部类的成员，则可以使用(外部类名.this.成员) 去访问
            System.out.println("成员内部类 n = " + n + " name = " + name + "外部类 n = " + Outer03.this.n);
            m1();
        }
    }

    public Inner03 getInner03Instance(){
        return new Inner03();
    }

    //5、外部类-->访问-->成员内部类 （需要创建对象再访问）
    public void test(){
        Inner03 inner03 = new Inner03();
        inner03.say();
        System.out.println(inner03.sal);    //调用属性和方法都没问题
    }
}