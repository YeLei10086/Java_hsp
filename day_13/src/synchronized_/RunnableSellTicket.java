package synchronized_;

/**
 * @author 叶磊
 *
 * synchronized() 互斥锁
 * 同步方法(非静态的)的锁可以是this,也可以是其他对象(要求是同一个对象)
 * 同步方法(静态的)的锁为当前本身类
 * 同步方法的局限性：导致程序的执行效率要降低
 * 优势：当某个对象用 synchronized修饰时,表面该对象在任意时刻都只能由一个线程访问
 */
public class RunnableSellTicket {
    public static void main(String[] args) {
        R1 r1 = new R1();
        new Thread(r1).start();
        new Thread(r1).start();
        new Thread(r1).start();
    }
}

class R1 implements Runnable{

    private static int tickets = 100;
    private static boolean loop = true;
    Object object = new Object();

    //解读：
    //同步方法(静态的)的锁为当前本身类
    //1、 public synchronized static void sell2(){}  锁是加在R1.class(即当前类名.class文件)
    //2、如果在静态方法中.实现同步代码块,使用如下方法
    public /*synchronized*/ static void sell2(){
        synchronized (R1.class){
            if (tickets <= 0) {
                System.out.println("票已售空...");
                loop = false;   //票卖完了,退出循环
                return;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("售票员 = " + Thread.currentThread().getName() + " 售出一张票,还剩下" + (--tickets) + "张票");
        }
    }

    //解读：
    // 同步方法(非静态的)的锁可以是this,也可以是其他对象(要求是同一个对象)
    //1、public synchronized void sell(){} 其实就是一个同步方法
    //2、这是锁在 this对象
    //3、也可以在代码块上写 synchronized ,同步代码块，互斥锁还是在 this对象
    public /*synchronized*/ void sell() {    //加入synchronized关键字,开启同步方法,解决超售情况
        synchronized (/*this*/ /*new Object()*/ object) {    //操作的对象必须是同一个对象,如果这里用的是new的对象,说明这个对象不是同一个对象，还是会出现超卖现象
            if (tickets <= 0) {
                System.out.println("票已售空...");
                loop = false;   //票卖完了,退出循环
                return;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("售票员 = " + Thread.currentThread().getName() + " 售出一张票,还剩下" + (--tickets) + "张票");
        }
    }

    @Override
    public void run() {
        while (loop){
            sell();
        }
    }
}