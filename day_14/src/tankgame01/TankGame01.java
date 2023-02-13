package tankgame01;

import javax.swing.*;

/**
 * @author 叶磊
 */
public class TankGame01 extends JFrame {
    //在窗口中定义一个区域面板
    private MyPanel my = null;

    public static void main(String[] args) {
        TankGame01 tankGame01 = new TankGame01();
    }

    public TankGame01(){
        my = new MyPanel();
        this.add(my);   //添加游戏的绘图区域
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
