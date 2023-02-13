package tankgame04;

import javax.swing.*;

/**
 * @author 叶磊
 */
public class MyTankGame04 extends JFrame {

    private MyPanel mp = null;

    public static void main(String[] args) {
        MyTankGame04 myTankGame04 = new MyTankGame04();
    }

    public MyTankGame04(){
        mp = new MyPanel();
        //由于实现了重绘线程,因此这里要加入线程
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);
        this.addKeyListener(mp);
//        this.setSize(1000,750);
        this.setSize(1200,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
