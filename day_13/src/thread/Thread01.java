package thread;

/**
 * @author 叶磊
 * 演示通过继承 Thread 创建线程
 * 使用 jconsole 查看线程
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        //创建一个Cat对象,可以当作线程使用
        Cat cat = new Cat();
        //启动线程
        cat.start();    //最终会执行cat.run()方法
        //这里为什么不是直接调用run()方法,而要用start()方法？
        //答：run() 只是一个普通的方法,如果直接调用run()方法,相当于main在调用run()这个方法,
        // 就必须要等run()执行完成,再执行下一行代码,这样相当于没有开启 Thread (即阻塞)
        /*
            源码解析：
            1、public synchronized void start() {
                   start0();
               }
            2、start0(); 是一个本地方法,是由JVM调用,底层是c/c++实现的
               真正实现多线程的效果,是 start0() ,并不是 run()
            private native void start0();

            @Override
            public void run() {
                if (target != null) {
                    target.run();
                }
            }

         */


        //当main线程启动一个子线程：Thread-0,主线程不会阻塞,会继续执行
        //主线程和子线程是交替执行的
        System.out.println("主程序继续执行..." + Thread.currentThread().getName());    //获取主线程名称: main
        for (int i = 0; i < 60; i++) {
            System.out.println("主程序执行次数i = " + i );
            Thread.sleep(1000);
        }
        //注意！
        //1、如果是一个CPU在执行该线程,就代表是并发
        //2、如果是多个CPU在执行该线程,就代表是并行
    }

}

//1、当一个类继承了 Thread 类,该类就可以当做线程使用
//2、我们会重新 run() 方法,写入自己的业务代码
//3、 run() Thread 类,实现了 Runnable 接口的 run() 方法
/*
   源码：
        @Override
        public void run() {
            if (target != null) {
                target.run();
            }
        }
 */
class Cat extends Thread{

    int times = 0;

    @Override
    public void run() {
        while (true){
            System.out.println("猪头..." + (++times) + "  子线程名称："+ Thread.currentThread().getName()); //获取子线程的名字
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (times == 80){
                break;
            }
        }
    }
}