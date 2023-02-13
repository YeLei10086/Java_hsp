package homework;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class HomeWork01 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2(t1);
        t1.start();
        t2.start();
    }
}

//创建A类线程
class T1 extends Thread{
    private boolean flag = true;

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        while (flag){
            System.out.println((int)(Math.random() * 100 + 1));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("A线程退出...");
    }
}

//创建B类线程
class T2 extends Thread{
    private T1 t1;

    public T2(T1 t1){
        this.t1 = t1;
    }

    @Override
    public void run() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入（Q退出）：");
            char key = sc.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                //已通知的方式结束A线程
                t1.setFlag(false);
                System.out.println("B线程退出...");
                break;
            }
        }
    }
}