package method;

/**
 * @author 叶磊
 *
 * setDaemon()
 */
public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        //如果我们希望当main线程结束后,子线程自动结束
        //只需将子线程设置为守护线程即可
        myDaemonThread.setDaemon(true); //设置守护线程
        myDaemonThread.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("守护的我小猪头" + i);
            Thread.sleep(1000);
        }
    }
}

class MyDaemonThread extends Thread{
    @Override
    public void run() {
        for (; ; ) {    //等同于 无限循环
            System.out.println("小猪头在睡觉...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}