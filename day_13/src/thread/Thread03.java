package thread;

/**
 * @author 叶磊
 */
public class Thread03 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();

        Thread thread = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread.start();
        thread2.start();
        //解读：
        //实际上这里看线程里其实是由3个线程的,只不过main()方法 创建完对象之后,没有它的活了,因此结束了
    }
}

class T1 implements Runnable {

    int count = 0;

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("hello" + (++count) + " 子线程的名称 = " + Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 60) {
                break;
            }
        }
    }
}

class T2 implements Runnable {

    int count = 0;

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("hi" + (++count) + " 子线程的名称 = " + Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 80) {
                break;
            }
        }
    }
}

