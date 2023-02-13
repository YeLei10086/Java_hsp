package thread;

/**
 * @author 叶磊
 * 模拟线程代理
 */
public class ThreadProxy implements Runnable{   //线程代理类
    public static void main(String[] args) {
        //由于Java是单继承的,因此我们要实现其他的东西,就需要借助一个代理来帮助我们完成这件事
        //过程是由代理帮你完成的,但最后反馈结果的那个人还是你自己
        Pig pig = new Pig();
        ThreadProxy threadProxy = new ThreadProxy(pig);
        threadProxy.start();
    }

    private Runnable target = null; //属性, 类型是Runnable

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    @Override
    public void run() {
        if (target != null){
            target.run();   //根据运行类型 进行 动态绑定 run()方法
        }
    }

    public void start(){
        start0();   //这个方法是真正实现多线程的方法
    }

    public void start0(){
        run();
    }
}

//动物类
class Animal{

}
//子类
class Pig extends Animal implements Runnable{

    @Override
    public void run() {
        System.out.println("猪头正在睡觉...");
    }
}