package mytank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author 叶磊
 * 坦克大战绘制作战区域
 */

//加入 KeyListener 监听事件
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义我自己的坦克
    private MyTank mt = null;
    //定义一个线程安全的集合放敌方坦克
    Vector<EnemyTank> enemyTanks = new Vector<>();
    //定义爆炸效果
    //坦克被击中时,产生该效果
    Vector<Bomb> bombs = new Vector<>();
    //定义一个敌方坦克的初始值
    int enemyTankSize = 8;
    //定义爆炸效果图
    Image image = null;
    Image image2 = null;
    Image image3 = null;

    public MyPanel() {
        mt = new MyTank(100, 200);   //初始化坦克坐标
        mt.setSpeed(3); //设置坦克的移动速度
        //利用for循环添加敌方坦克
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            //将 enemyTanks 加入 到EnemyTank集合中
            enemyTank.setEnemyTanks(enemyTanks);
            enemyTank.setDirection(2);
            new Thread(enemyTank).start();
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirection());
            enemyTank.shots.add(shot);
            new Thread(shot).start();
            enemyTanks.add(enemyTank);
        }
        //图片初始化
        image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);   //填充矩形,默认是黑色
        //画出坦克--封装方法
        //如果坦克不为空,并且坦克存活
        if (mt != null && mt.isLive()) {
            drawTank(mt.getX(), mt.getY(), g, mt.getDirection(), 0);
        }
//        //画出我方子弹
//        if (mt.getShot() != null && mt.getShot().isLive()) {
//            g.draw3DRect(mt.getShot().getX(), mt.getShot().getY(), 1, 1, false);
//        }
        //画出我方子弹,多颗
        for (int i = 0; i < mt.shots.size(); i++) {
            Shot shot = mt.shots.get(i);
            if (shot != null && shot.isLive()) { //如果子弹不为null，且子弹存活
                g.draw3DRect(shot.getX(), shot.getY(), 1, 1, false);
            } else {
                mt.shots.remove(shot);
            }
        }

        //画出爆炸效果
        for (int i = 0; i < bombs.size(); i++) {
            Bomb bomb = bombs.get(i);
            if (bomb.getLife() > 6) {
                g.drawImage(image, bomb.getX(), bomb.getY(), 60, 60, this);
            } else if (bomb.getLife() > 3) {
                g.drawImage(image2, bomb.getX(), bomb.getY(), 60, 60, this);
            } else {
                g.drawImage(image3, bomb.getX(), bomb.getY(), 60, 60, this);
            }
            bomb.downLife();
            if (!bomb.isLive()) {
                bombs.remove(bomb);
            }
        }

        //画出敌方坦克,遍历 Vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            if (enemyTank.isLive()) {
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), 1);
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    Shot shot = enemyTank.shots.get(j);
                    if (shot.isLive()) {
                        g.fill3DRect(shot.getX(), shot.getY(), 2, 2, false);
                    } else {
                        enemyTank.shots.remove(shot);
                    }
                }
            }
        }
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
                g.fill3DRect(x, y, 60, 10, false);  //画出坦克上边的轮子
                g.fill3DRect(x, y + 30, 60, 10, false); //画出坦克下边的轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);    //画出坦克的盖子
                g.fillOval(x + 20, y + 10, 20, 20);    //画出圆形炮筒盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);  //画出坦克的炮筒
                break;
            default:
                System.out.println("暂未做处理");
        }
    }

    //如果我们的坦克可以发射多颗子弹
    //在判断我方子弹是否击中敌方坦克时，
    //需要把我们的子弹集合中,所有的子弹取出和敌人的坦克进行判断
    public void hitEnemyTank() {
        for (int i = 0; i < mt.shots.size(); i++) {
            Shot shot = mt.shots.get(i);
            if (shot != null && shot.isLive()) {
                for (int j = 0; j < enemyTanks.size(); j++) {
                    EnemyTank enemyTank = enemyTanks.get(j);
                    if (mt.isLive() && shot.isLive()) {
                        hitTank(shot, enemyTank);
                    }
                }
            }
        }
    }

    public void hitPlayerTank() {
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                Shot shot = enemyTank.shots.get(j);
                if (mt.isLive() && shot.isLive()) {
                    hitTank(shot, mt);
                }
            }
        }
    }

    //击毁坦克
    public void hitTank(Shot shot, Tank tank) {
        switch (tank.getDirection()) {
            case 0: //上
            case 2: //下
                if (shot.getX() > tank.getX() && shot.getX() < tank.getX() + 40
                        && shot.getY() > tank.getY() && shot.getY() < tank.getY() + 60) {
                    shot.setLive(false);
                    tank.setLive(false);
                    enemyTanks.remove(tank);
                    Bomb bomb = new Bomb(tank.getX(), tank.getY());
                    bombs.add(bomb);
                }
            case 1: //左
            case 3: //右
                if (shot.getX() > tank.getX() && shot.getX() < tank.getX() + 60
                        && shot.getY() > tank.getY() && shot.getY() < tank.getY() + 40) {
                    shot.setLive(false);    //打中坦克就死亡
                    tank.setLive(false);    //被打中就死亡
                    enemyTanks.remove(tank);    //坦克死亡就从集合中移除
                    Bomb bomb = new Bomb(tank.getX(), tank.getY());  //创建一个bomb对象
                    bombs.add(bomb);    //将爆炸位置放入爆炸集合中
                }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //根据 W A S D 键 按下来判断方向
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            //修改坦克的方向
            mt.setDirection(0);
            //修改坦克的坐标
            if (mt.getY() > 0) {
                mt.moveUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            mt.setDirection(1);
            if (mt.getX() > 0) {
                mt.moveLeft();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            mt.setDirection(2);
            if (mt.getY() + 60 < 750) {
                mt.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            mt.setDirection(3);
            if (mt.getX() + 60 < 1000) {
                mt.moveRight();
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_J) {
            //发射一颗子弹
//            if (mt.getShot() == null || mt.getShot().isLive() == false) {
//                mt.shotEnemyTank();
//            }
            //发射多颗子弹
            mt.shotEnemyTank();
        }
        //必须重绘画板,否则无法移动坦克
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //击毁敌方坦克
            hitEnemyTank();
            //击毁我方坦克
            hitPlayerTank();
            this.repaint();
        }
    }
}
