package 单例模式;

/**
 * 步骤：
 *  1、构造器私有化 -->  防止直接new
 *  2、类的内部创建对象
 *  3、向外暴露一个静态的公有方法
 */
public class 懒汉式 {
    public static void main(String[] args) {
        Cat cat = Cat.getInstance();
        System.out.println(cat);

        Cat cat2 = Cat.getInstance();
        System.out.println(cat2);

        System.out.println(cat == cat2); //对象地址相同  True
    }
}

//希望在程序运行过程中，创建一只猫
class Cat{

    private String name;

    // 2、类的内部创建对象
    private static Cat cat; //这里由于是懒汉式，因此不直接创建对象,这样就不会对资源产生浪费了

    // 1、构造器私有化 -->  防止直接new
    private Cat(String name) {
        System.out.println("构造器被调用...");
        this.name = name;
    }

    // 3、向外暴露一个静态的公有方法
    public static Cat getInstance(){
        //如果还没有创建Cat对象（调用了getInstance()才创建）
        if (cat == null){
            cat = new Cat("大花猫");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}