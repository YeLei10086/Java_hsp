package homework;

/**
 * @author 叶磊
 */
public class HomeWork02 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Thread thread = new Thread(bank);
        Thread thread2 = new Thread(bank);
        thread.setName("取款人1");
        thread2.setName("取款人2");
        thread.start();
        thread2.start();
    }
}

class Bank implements Runnable {

    private boolean flag = true;
    private static int money = 10000;
    private int num = 1000;

//    public void withdrawMoney() {
//        synchronized (this) {
//            if (money < 1000) {
//                System.out.println("余额不足,取款失败！");
//                flag = false;
//                return;
//            }
//            money -= 1000;
//            System.out.println(Thread.currentThread().getName() + " 取款：" + num + "剩余金额：" + money);
//        }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    @Override
    public void run() {
        while (flag) {

            //解读：
            //1、这里使用 synchronized 实现了线程同步
            //2、当多个线程执行到这里时,就会去争夺 this对象锁
            //3、哪个线程获取抢夺到（获取到）this对象锁,就执行 synchronized 代码块,执行完后,会释放 this对象锁
            //4、争夺不到this对象锁,就blocked,准备继续争夺
            //5、this对象锁 是非公平锁
            synchronized (this) {
                if (money < 1000) {
                    System.out.println("余额不足,取款失败！");
                    flag = false;
                    break;
                }
                money -= 1000;
                System.out.println(Thread.currentThread().getName() + " 取款：" + num + "剩余金额：" + money);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}