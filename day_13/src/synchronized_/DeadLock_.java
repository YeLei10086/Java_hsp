package synchronized_;

/**
 * @author 叶磊
 */
public class DeadLock_ {
    public static void main(String[] args) {
        DeadLockDemo deadLockDemo = new DeadLockDemo(true);
        DeadLockDemo deadLockDemo2 = new DeadLockDemo(false);
        deadLockDemo.setName("A线程");
        deadLockDemo2.setName("B线程");
        deadLockDemo.start();
        deadLockDemo2.start();

    }
}

class DeadLockDemo extends Thread{
    private static Object o1 = new Object();    //保证多线程,共享一个对象,这里使用static
    private static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag){
        this.flag = flag;
    }

    @Override
    public void run() {

        //下面业务逻辑的分析
        //1、如果flag 为 T,线程A 就会得到/持有 o1 对象锁,然后去尝试获取 o2 对象锁
        //2、如果线程A 得不到o2 对象锁,就会发生死锁(即Blocked)
        //3、如果flag 为 F,线程B 就会得到/持有 o2 对象锁,然后去尝试获取 o1 对象锁
        //4、如果线程B 得不到o1 对象锁,就会发生死锁(即Blocked)
        if (flag){
            synchronized (o1){  //对象互斥锁,下面就是同步代码
                System.out.println(Thread.currentThread().getName() + "  进入1...");
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName() + "  进入2...");
                }
            }
        }else {
            synchronized (o2){
                System.out.println(Thread.currentThread().getName() + "  进入3...");
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName() + "  进入4...");
                }
            }
        }
    }
}