package static_;

public class VisitStatic {
    public static void main(String[] args) {
        Child child1 = new Child("白骨精");
        child1.join();
        // 类名·变量名访问(推荐)
        // 类变量是随着类的加载而创建的，所以即使没用创建类的实例也可以访问
        Child.count++;
        //通过对象名·类变量名(不推荐)
        //child1.count++;

        Child child2 = new Child("狐狸精");
        child2.join();
        Child.count++;
        Child child3 = new Child("蜘蛛精");
        child3.join();
        Child.count++;
        System.out.println("共有" + Child.count + "个小朋友加入游戏..");
    }
}

class Child{
    private String name;
    /*
    1.静态变量(static)一定被同一个类的所有对象共享的
    2.static类变量，在类加载的时候就生成了
    3.无论这个静态变量是在静态域(说法：jdk7--jdk8以前)还是堆内存(说法：jdk8以后)中,都不影响对静态变量的使用
    4.类变量的访问，必须遵守相关的访问权限,否则无法访问
        eg: private static int count = 0;
     */
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join(){
        System.out.println(name + "  加入了游戏..");
    }
}
