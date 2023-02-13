package tankgame05;

import javax.swing.*;

/**
 * @author 叶磊
 */
public class MyTankGame05 extends JFrame {

    private MyPanel mp = null;

    public static void main(String[] args) {
        MyTankGame05 myTankGame05 = new MyTankGame05();
    }

    public MyTankGame05(){
        mp = new MyPanel();
        //由于实现了重绘线程,因此这里要加入线程
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);
        this.addKeyListener(mp);
//        this.setSize(1000,750);
        this.setSize(1050,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
