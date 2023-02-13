package threadexit_;

/**
 * @author 叶磊
 */
public class ThreadExit {
    public static void main(String[] args) {
        R1 r1 = new R1();
        new Thread(r1).start();

        System.out.println("让主程序先睡眠10秒");
        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //停止R1的线程运行
        r1.setFalg(false);
    }
}

class R1 implements Runnable {
    private boolean falg = true;

    public void setFalg(boolean falg) {
        this.falg = falg;
    }

    @Override
    public void run() {
        while (falg) {
            System.out.println("想睡觉运行中...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}