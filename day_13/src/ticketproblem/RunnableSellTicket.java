package ticketproblem;

/**
 * @author 叶磊
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

    private int tickets = 100;

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