package reflection.class_;

import reflection.question.Cat;

/**
 * @author 叶磊
 */
public class Class_ {
    public static void main(String[] args) throws ClassNotFoundException {
        //1、Class类,也是继承于 Object类
        //2、Class类对象不是new出来的,而是系统创建的
        //  2.1 创建传统 new 对象
        Cat cat = new Cat();
        /*
            源码：
                public Class<?> loadClass(String name) throws ClassNotFoundException {
                    return loadClass(name, false);
                }
         */
        //2.2 使用反射的方式创建对象
        Class cla01 = Class.forName("reflection.question.Cat");
        /*  最终走向的都是 ClassLoader 类中的 loadClass 方法
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return loadClass(name, false);
            }
         */

        //3、对于某个类的Class对象,只会在内存中存在一个,即类的加载只会存在一次
        Class cla02 = Class.forName("reflection.question.Cat");
        System.out.println(cla01.hashCode());
        System.out.println(cla02.hashCode());

        //4、每个类的实例都会记得自己是由哪个Class实例所生成的
        //5、通过Class可以完整的得到一个类的完整结构，通过API
        //6、Class对象是存放在堆中的
        //7、类的字节码二进制数据,是放在方法区的,有的地方称为 类的元数据（包括方法代码、变量名、方法名、访问权限等等）
    }
}
