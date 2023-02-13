package object详解;

public class Finalize讲解 {
    /**
     * 1.当对象被回收时，系统自动调用该对象的 finalize() ，子类可以重写该方法，做一些 释放资源 的操作。
     * 2.什么时候被回收？
     *      当某个对象 没有任何引用时 ，则 jvm 就认为这个对象是一个 垃圾对象 ，就会使用 垃圾回收机制 来 销毁该对象 ，
     *      在销毁该对象之前，会先调用 finalize()。
     * 3.垃圾回收机制的调用，是由 系统(GC算法)来决定的 ，也可以通过 System.gc() 主动触发垃圾回收机制。
     *
     * @param args
     */
    public static void main(String[] args) {
        Car bmw = new Car("宝马");

        // 这时 car对象就是一个垃圾，垃圾回收器 就会 回收(销毁)对象，在销毁对象前，会调用该对象的 finalize()
        //程序员可以在finalize()，在里面也自己的业务逻辑代码。(比如：释放资源：数据库连接,或者打开文件...)
        //如果程序员不重写finalize(),那么就会调用 Object类中的finalize() ，即默认处理。
        //如果程序员重写了finalize()，那么就会可以实现自己的逻辑。
        /**
         * 2.什么时候被回收？
         *      当某个对象 没有任何引用时 ，则 jvm 就认为这个对象是一个 垃圾对象 ，就会使用 垃圾回收机制 来 销毁该对象 ，
         *      在销毁该对象之前，会先调用 finalize()。
         */
        bmw = null;

        //3.垃圾回收机制的调用，是由 系统(GC算法)来决定的 ，也可以通过 System.gc() 主动触发垃圾回收机制。
        System.gc();    // 调用 System.gc() 方法不会导致程序阻塞，而是直接执行下一行代码
        System.out.println("结束测试。。");
    }
}

class Car{
    private String name;

    public Car(String name) {
        name = name;
    }

    /**
     * 1.当对象被回收时，系统自动调用该对象的 finalize() ，子类可以重写该方法，做一些 释放资源 的操作。
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("回收了" + name);
        System.out.println("资源被释放了..");
    }
}