package method;

/**
 * @author 叶磊
 */
public class ThreadMethodExersice {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.setName("hcy");
        t2.setPriority(10);

        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " 大狗头" + i);
            Thread.sleep(1000);
            if (i == 5){
                t2.start(); //启动子线程
                t2.join();  //立即把t2子线程,插入到main线程,让t2先执行
                System.out.println("子程序已结束...");
            }
        }
        System.out.println("主程序已结束");
    }
}

class T2 extends Thread {

    private int count = 0;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " 我的小猪头" + (++count));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10){
                break;
            }
        }
    }
}
