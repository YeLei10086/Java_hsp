package 单例模式;

/**
 * 步骤如下：
 *  1、构造器私有化 --> 防止用户直接new一个对象
 *  2、类的内部创建对象
 *  3、向外暴露一个静态的公有方法。 getInstance()
 */
public class 饿汉式 {
    public static void main(String[] args) {
        //现在我们就只剩一个对象了，直接使用就好了
        Wife wife = Wife.getInstance();
        System.out.println(wife);

        Wife wife2 = Wife.getInstance();
        System.out.println(wife2);

        System.out.println(wife == wife2);  // 同一个对象  True

    }
}

/**
 * 小结：
 *     饿汉式的单例模式通常是一个重量级对象
 *     饿汉式的写法可能会造成资源的浪费，因为随着类的加载，（static）它会直接创建对象(着急),可能导致这个对象未被我们使用，但一直存在于内存当中
 */
// 一个人只能有一个老婆
class Wife{

    private String name;

    //2、类的内部创建对象（该对象必须是静态的）
    //为了能够在静态方法中，返回wife对象，需要将其修饰为static
    private static Wife wife = new Wife("小芳");      //静态相关的属性，在类加载的时候就调用了，且只会调用一次

    //1、构造器私有化 --> 防止用户直接new一个对象
    private Wife(String name) {
        System.out.println("构造器被调用了...");
        this.name = name;
    }

    //3、向外暴露一个静态的公有方法,可以返回wife对象。 如：getInstance()
    //如果去掉static 说明它不是一个静态方法，调用时还是需要new一个对象，这样就不算单例模式了
    public static Wife getInstance(){
        return wife;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                '}';
    }
}
