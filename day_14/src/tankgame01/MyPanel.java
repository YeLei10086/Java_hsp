package tankgame01;

import java.awt.*;

/**
 * @author 叶磊
 * 坦克大战绘制作战区域
 */
public class MyPanel extends Panel {
    //定义我自己的坦克
    private MyTank mt = null;

    public MyPanel() {
        mt = new MyTank(100, 200);   //初始化坦克坐标
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);   //填充矩形,默认是黑色

        //画出坦克--封装方法
        drawTank(mt.getX(), mt.getY(), g, 0, 0);

    }

    /**
     * //编写画出坦克的方法,方便复用
     *
     * @param x         坦克的左上角x坐标
     * @param y         坦克的左上角y坐标
     * @param g         画笔
     * @param direction 坦克的方向（上下左右）
     * @param type      坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direction, int type) {

        //判断是自己的坦克还是敌人的坦克
        switch (type) {
            case 0: //代表玩家坦克
                g.setColor(Color.yellow);
                break;
            case 1: //代表敌军坦克
                g.setColor(Color.cyan);
                break;
        }

        //根据坦克方向,来绘制坦克
        switch (direction) {
            case 0: //上
                g.fill3DRect(x, y, 10, 60, false);  //画出坦克左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false); //画出坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);    //画出坦克的盖子
                g.fillOval(x + 10, y + 20, 20, 20);    //画出圆形炮筒盖子
                g.drawLine(x + 20, y + 30, x + 20, y);  //画出坦克的炮筒
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("暂未做处理");
        }
    }
}
