package mytank;

import javax.swing.*;

/**
 * @author 叶磊
 */
public class TankGameMain extends JFrame {
    //在窗口中定义一个区域面板
    private MyPanel mp = null;

    public static void main(String[] args) {
        TankGameMain tankGameMain = new TankGameMain();
    }

    public TankGameMain(){
        mp = new MyPanel();
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);   //添加游戏的绘图区域
        this.addKeyListener(mp);    //将监听事件放入窗口中
        this.setSize(1050,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
