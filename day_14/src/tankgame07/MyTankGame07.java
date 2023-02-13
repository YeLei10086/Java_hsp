package tankgame07;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Scanner;

/**
 * @author 叶磊
 */
public class MyTankGame07 extends JFrame {

    private MyPanel mp = null;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MyTankGame07 myTankGame07 = new MyTankGame07();
    }

    public MyTankGame07(){
        System.out.println("请输入： 1、开始新游戏     2、继续上局游戏");
        String key = sc.next();
        mp = new MyPanel(key);
        //由于实现了重绘线程,因此这里要加入线程
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);
        this.addKeyListener(mp);
//        this.setSize(1000,750);
        this.setSize(1300,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        //增加一个监听事件,在我们点击退出游戏时
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                Recorder.keepRecordInfo();
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }
}
