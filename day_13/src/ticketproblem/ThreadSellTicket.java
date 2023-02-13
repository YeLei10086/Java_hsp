package ticketproblem;

/**
 * @author 叶磊
 */
public class ThreadSellTicket {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T1 t2 = new T1();
        T1 t3 = new T1();

        t1.start();
        t2.start();
        t3.start();
    }
}

class T1 extends Thread {

    private static int tickets = 100;   //让多个线程共享一个 tickets

    @Override
    public void run() {
        while (true){
            if (tickets <= 0){
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("售票员 = " + Thread.currentThread().getName() + " 售出一张票,还剩下"+(--tickets) + "张票");
        }
    }
}