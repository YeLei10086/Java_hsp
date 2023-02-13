package 内部类;

/**
 *  静态内部类
 */
public class StaticInnerClass01 {   //其他外部类
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.test();

        //6、外部其他类-->访问-->静态内部类（三种访问方式）
        //第一种
        // 因为静态内部类，是可以通过类名来直接访问的，但前提是满足访问权限(指public、protected、默认、private)
        Outer04.Inner04 inner04 = new Outer04.Inner04();
        System.out.println("====================");
        inner04.say();
        //第二种
        //编写一个方法,可以返回静态内部类的对象实例
        Outer04.Inner04 inner04Instance = outer04.getInner04Instance();
        System.out.println("====================");
        inner04Instance.say();
        //第三种
        //编写一个静态的方法,可以返回静态内部类的对象实例
        Outer04.getInner04Instance_02().say();
    }
}

//3、作用域：和外部类的其他成员一样,为整个类体
class Outer04 { //外部类
    private int n = 10;
    private static String name = "张三";
    private static void run(){
        System.out.println("我是一个静态的方法");
    }

    private void cry(){
        System.out.println("我是一个普通方法");
    }

    //说明：静态内部类是定义在外部类的成员位置，并且有static修饰
    //2、可以添加任意修饰符(public、protected、默认、private),因为它的地位就是一个成员
    public static class Inner04 {  //静态内部类
        private static String name = "法外狂徒";
        public void say(){
            //1、可以直接访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员
            System.out.println(name);
            //4、静态内部类-->可以直接访问所有静态成员-->外部类
            run();
            // 7、如果外部类和内部类重名时，内部类访问的话，默认遵循就近原则，如果想访问外部类的成员，则可以使用(外部类.成员) 去访问
            System.out.println("静态内部类的 name = " + name + "   外部类的 name = " + Outer04.name);
        }
    }

    public Inner04 getInner04Instance(){
        return new Inner04();
    }

    public static Inner04 getInner04Instance_02(){
        return new Inner04();
    }

    //5、外部类-->访问-->静态内部类(必须创建对象，再访问)
    public void test(){
        Inner04 inner04 = new Inner04();
        inner04.say();
    }
}
