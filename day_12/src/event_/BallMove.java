package event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author 叶磊
 */

//绘图窗口
public class BallMove extends JFrame {
    private MyPanel mp = null;

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    public BallMove(){
        mp = new MyPanel();
        this.add(mp);
        this.addKeyListener(mp);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

//绘图面板
//KeyListener 是监听事件,可以监听键盘事件
class MyPanel extends Panel implements KeyListener {
    //为了让小球可以移动,让它的左上角的坐标(x,y)设置成变量
    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);
    }

    //有字符输出时,该方法就会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //当某个键按下,该方法触发
    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println(e.getKeyCode() + "被按下...");
        //在Java中,每个键都会被分配一个(int)值
        if (e.getKeyCode() == KeyEvent.VK_DOWN){        //KeyEvent.VK_DOWN 就是向下的箭头对应的code
            y++;
        }else if (e.getKeyCode() == KeyEvent.VK_UP){
            y--;
        }else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            x++;
        }else if (e.getKeyCode() == KeyEvent.VK_LEFT){
            x--;
        }
        //让面板重绘
        this.repaint();
    }


    //当某个键松开,该方法触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}