package tankgame03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author 叶磊
 */

//由于画出子弹,要不停的重绘,因此我们加入 Runnable 接口,实现重绘线程
public class MyPanel extends JPanel implements KeyListener,Runnable {
    private MyTank mt = null;
    //将敌人的坦克定义到一个安全线程的集合中
    Vector<EnemyTank> enemyTanks = new Vector<>();
    //初始化定义坦克数量
    int enemyTankSize = 3;

    public MyPanel(){
        mt = new MyTank(100,200);
        mt.setSpeed(5); //设置坦克的速度，默认速度为1
        for (int i = 0; i < enemyTankSize; i++) {
            //添加敌方坦克,x轴变化,y轴不变
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            //由于默认的 direction = 0 ,坦克的炮筒是朝上的,因此这里灵活一点,先设置坦克炮筒朝下,再装入对象
            enemyTank.setDirection(2);
            enemyTanks.add(enemyTank);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);
        //画出我方坦克
        drawTank(mt.getX(),mt.getY(),g,mt.getDirection(),0);

        //画出我方坦克子弹
        //如果Shot对象不为null 并且 子弹没有超出边界值
        if(mt.getShot() != null && mt.getShot().isLive() == true){
//            g.fillOval(mt.getShot().getX(),mt.getShot().getY(),3,3);
            g.draw3DRect(mt.getShot().getX(),mt.getShot().getY(),1,1,false);
        }

        //画出敌方坦克,遍历 Vector 取出
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirection(),1);
        }
    }

    //封装画坦克
    /**
     *
     * @param x 坦克左上角的x坐标
     * @param y 坦克左上角的y坐标
     * @param g 画笔
     * @param direction 坦克移动方向（上下左右）
     * @param type  坦克的类型
     */
    public void drawTank(int x,int y,Graphics g,int direction,int type){

        switch (type){
            case 0: //玩家坦克
                g.setColor(Color.yellow);
                break;
            case 1: //敌方坦克
                g.setColor(Color.cyan);
                break;
        }

        switch (direction){
            case 0: //上
                g.fill3DRect(x, y, 10, 60, false);  //画出坦克左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false); //画出坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);    //画出坦克的盖子
                g.fillOval(x + 10, y + 20, 20, 20);    //画出圆形炮筒盖子
                g.drawLine(x + 20, y + 30, x + 20, y);  //画出坦克的炮筒
                break;
            case 1: //左
                g.fill3DRect(x, y, 60, 10, false);  //画出坦克上边的轮子
                g.fill3DRect(x, y + 30, 60, 10, false); //画出坦克下边的轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);    //画出坦克的盖子
                g.fillOval(x + 20, y + 10, 20, 20);    //画出圆形炮筒盖子
                g.drawLine(x + 30, y + 20, x, y + 20);  //画出坦克的炮筒
                break;
            case 2: //下
                g.fill3DRect(x, y, 10, 60, false);  //画出坦克左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false); //画出坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);    //画出坦克的盖子
                g.fillOval(x + 10, y + 20, 20, 20);    //画出圆形炮筒盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60);  //画出坦克的炮筒
                break;
            case 3: //右
                g.fill3DRect(x, y, 60, 10, false);  //画出坦克左、上边的轮子
                g.fill3DRect(x, y + 30, 60, 10, false); //画出坦克下边的轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);    //画出坦克的盖子
                g.fillOval(x + 20, y + 10, 20, 20);    //画出圆形炮筒盖子
                g.drawLine(x + 30, y + 20 , x + 60, y + 20);  //画出坦克的炮筒
                break;
            default:
                System.out.println("暂未做处理");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理 W A S D 键 按下的情况
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W){
            //修改坦克的方向
            mt.setDirection(0);
            //修改坦克的坐标
            mt.moveUp();
        }else if (e.getKeyCode() == KeyEvent.VK_A){
            mt.setDirection(1);
            mt.moveLeft();
        }else if (e.getKeyCode() == KeyEvent.VK_S){
            mt.setDirection(2);
            mt.moveDown();
        }else if (e.getKeyCode() == KeyEvent.VK_D){
            mt.setDirection(3);
            mt.moveRight();
        }

        //如果用户按下的是J,我们启动射击线程
        if (e.getKeyCode() == KeyEvent.VK_J){
            System.out.println("用户按下了J键,开始发射子弹");
            mt.shotEnemyTank();
        }
        //必须重绘
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.repaint();
        }
    }
}
