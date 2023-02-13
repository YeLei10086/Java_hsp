package method;

/**
 * @author 叶磊
 *  join()
 *  yield()
 */
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        R1 r1 = new R1();
        Thread thread = new Thread(r1);
        thread.start();
        thread.setName("子线程");   //更改线程的名称
        thread.setPriority(1);  //设置线程的优先级 1、5、10

        for (int i = 1; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " 小猪头..." + i);
            if (i == 5) {
                //join() 有意让其他线程插队,这个一定会成功
//                thread.join();
                //yield() 请求礼让他人,但是CPU会根据实际情况,做出相应的决定,不一定会接受这个请求(即,程序之间会交替进行)
                Thread.yield();

            }
        }
    }
}

class R1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " 大狗头..." + i);
        }
    }
}