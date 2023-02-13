package thread;

/**
 * @author 叶磊
 * 通过实现 Runnable 接口,开发线程
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
    }
}

class Dog implements Runnable{

    int times = 0;

    @Override
    public void run() {
        while (true){
            System.out.println("hi" + (++times) + " 子线程的名称 = " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 10){
                break;
            }
        }
    }
}