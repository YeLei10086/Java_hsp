package method;

/**
 * @author 叶磊
 *
 * getName()
 * setName()
 * getPriority()
 * setPriority()
 * start()
 * sleep()
 * interrupt()
 */
public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        t1.start();
        t1.setName("猪头");   //更改线程的名称
        t1.setPriority(1);  //设置线程的优先级 1、5、10

        //先让主线程执行5次,结束后中断子线程的休眠
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("主线程执行 " + i);
        }
        System.out.println(t1.getName() + " 的优先级 = "+ t1.getPriority());
        t1.interrupt(); //执行到这里后,中断子线程的休眠
    }
}

class T1 extends Thread{
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 50; i++) {
                System.out.println(Thread.currentThread().getName() + "  努力上班中..." + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "  先偷个懒...");
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                //当该线程执行到一个 Interrupt 方法时,就会catch 一个异常,可以加入自己的业务代码
                //InterruptedException 是捕获到一个中断异常
                System.out.println(Thread.currentThread().getName() + "  被 interrupt 了");
            }
        }
    }
}