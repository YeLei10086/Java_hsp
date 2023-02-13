package tankgame02;

import javax.swing.*;

/**
 * @author 叶磊
 */
public class MyTankGame02 extends JFrame {

    private MyPanel mp = null;

    public static void main(String[] args) {
        MyTankGame02 myTankGame02 = new MyTankGame02();
    }

    public MyTankGame02(){
        mp = new MyPanel();
        this.add(mp);
        this.addKeyListener(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
