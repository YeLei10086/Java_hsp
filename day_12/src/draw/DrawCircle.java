package draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author 叶磊
 */
//继承JFrame,是为了产生一个绘图窗口
public class DrawCircle extends JFrame{
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
        System.out.println("退出程序...");
    }

    public DrawCircle() {
        //画圆前,创建一个画板
        mp = new MyPanel();
        //添加进绘图窗口
        this.add(mp);
        //设置绘图窗口的大小
        this.setSize(1915,1077);
        //当点击程序窗口上的×,做到真正退出的语句
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口可以被看见
        this.setVisible(true);
    }
}

//1、先定义一个MyPanel,继承JPanel类,画圆形,就在面板上画
class MyPanel extends JPanel{

    //说明：
    //JPanel 相当于一个画板
    //Graphics g 相当于一支画笔
    @Override
    public void paint(Graphics g) { //绘图方法
        super.paint(g); //调用父类的方法完成初始化
        System.out.println("paint方法被调用了...");
        //画一个圆形
        //g.drawOval(30,30,100,100);

        //画图片 drawImage()   Image img, int x, int y,ImageObserver observer
        //1、获取图片资源
        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bg.png"));
        g.drawImage(image,10,10,1915,1077,this);

        //画字符串
        //1、先设置字体颜色
        g.setColor(Color.cyan);
        //2、设置字体型号,粗体,字体大小
        g.setFont(new Font("楷体",Font.BOLD,50));
        //字符串内容,坐标
        g.drawString("我的猪头",1200,600);
    }
}