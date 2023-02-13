package threadstate_;

/**
 * @author 叶磊
 *
 * 查看线程生命周期
 */
public class ThreadState_ {
    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        System.out.println(t1.getName() + "  状态 " + t1.getState());
        t1.start();

        while (Thread.State.TERMINATED != t1.getState()){
            System.out.println(t1.getName() + "  状态 " + t1.getState());
            Thread.sleep(500);
        }

        System.out.println(t1.getName() + "  状态 " + t1.getState());
    }
}

class T1 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "  hi...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}