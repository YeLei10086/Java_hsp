package tankgame05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author 叶磊
 *  画板
 */

//由于画出子弹,要不停的重绘,因此我们加入 Runnable 接口,实现重绘线程
public class MyPanel extends JPanel implements KeyListener, Runnable {
    public static final int X_MIN = 0;    //画板x轴的最小值
    public static final int X_MAX = 1000;    //画板x轴的最大值
    public static final int Y_MIN = 0;    //画板y轴的最小值
    public static final int Y_MAX = 750;    //画板y轴的最大值

    private MyTank mt = null;
    //将敌人的坦克定义到一个安全线程的集合中
    Vector<EnemyTank> enemyTanks = new Vector<>();
    //将炸弹放入 Vector 集合中
    //说明,当有子弹击中坦克时,加入一个 Bomb 对象到 bombs
    Vector<Bomb> bombs = new Vector<>();
    //初始化定义坦克数量
    int enemyTankSize = 3;

    //初始化三张图片
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    public MyPanel() {
        mt = new MyTank(100, 200);
        mt.setSpeed(5); //设置坦克的速度，默认速度为1
        for (int i = 0; i < enemyTankSize; i++) {
            //添加敌方坦克,x轴变化,y轴不变
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            //由于默认的 direction = 0 ,坦克的炮筒是朝上的,因此这里灵活一点,先设置坦克炮筒朝下,再装入对象
            enemyTank.setDirection(2);
            //创建敌方坦克时,启动随机方向的线程
            new Thread(enemyTank).start();
            //当 enemyTank 每创建一个敌人坦克对象,就给敌人坦克对象初始化一个Shot对象
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirection());
            //将一颗子弹放入坦克
            enemyTank.shots.add(shot);
            //同时启动Shot
            new Thread(shot).start();
            enemyTanks.add(enemyTank);
        }
        //初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        //画出我方坦克
        if (mt != null && mt.isLive()) {
            drawTank(mt.getX(), mt.getY(), g, mt.getDirection(), 0);
        }
        //画出我方坦克子弹
        //如果Shot对象不为null 并且 子弹没有超出边界值
//        if (mt.getShot() != null && mt.getShot().isLive() == true) {
//            g.draw3DRect(mt.getShot().getX(), mt.getShot().getY(), 1, 1, false);
//        }
        //画出我方坦克子弹
        for (int i = 0; i < mt.shots.size(); i++) {
            Shot shot = mt.shots.get(i);
            //如果shot对象不是null的,并且子弹还存活
            if (shot != null  && shot.isLive()) {
                g.draw3DRect(shot.getX(), shot.getY(), 1, 1, false);
            } else { //移除子弹
                mt.shots.remove(shot);
            }
        }

        // 如果 bombs 集合中 有bomb,就画出
        for (int i = 0; i < bombs.size(); i++) {
            //取出bombs对象
            Bomb bomb = bombs.get(i);
            //根据炸弹的life值画出对象的爆炸效果图
            if (bomb.getLife() > 6) {
                g.drawImage(image1, bomb.getX(), bomb.getY(), 60, 60, this);
            } else if (bomb.getLife() > 3) {
                g.drawImage(image2, bomb.getX(), bomb.getY(), 60, 60, this);
            } else {
                g.drawImage(image3, bomb.getX(), bomb.getY(), 60, 60, this);
            }
            //让炸弹的生命值减少
            bomb.downLife();
            if (bomb.getLife() == 0) {
                bombs.remove(bomb);
            }
        }

        //画出敌方坦克,遍历 Vector 取出
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            if (enemyTank.isLive()) {   //如果敌人的坦克还存活
                //画坦克
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), 1);
                //遍历敌人坦克对象 Vector
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    //绘制所有子弹
                    Shot shot = enemyTank.shots.get(j);
                    //当子弹没有超出边界值时,绘制子弹
                    if (shot.isLive()) {
                        g.draw3DRect(shot.getX(), shot.getY(), 1, 1, false);
                    } else { //否则,移除子弹
                        enemyTank.shots.remove(shot);
                    }
                }
            }
        }
    }

    /**
     * 封装画坦克
     *
     * @param x         坦克左上角的x坐标
     * @param y         坦克左上角的y坐标
     * @param g         画笔
     * @param direction 坦克移动方向（上下左右）
     * @param type      坦克的类型
     */
    public void drawTank(int x, int y, Graphics g, int direction, int type) {

        switch (type) {
            case 0: //玩家坦克
                g.setColor(Color.yellow);
                break;
            case 1: //敌方坦克
                g.setColor(Color.cyan);
                break;
        }

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
                g.fill3DRect(x, y, 60, 10, false);  //画出坦克左、上边的轮子
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
    //再判断我方子弹是否击中敌人坦克时,就需要把我们的子弹集合中所有的子弹都取出来
    //和敌人的所有坦克，进行判断
    /**
     * 击毁敌方坦克
     */
    public void hitEnemyTank() {
        for (int i = 0; i < mt.shots.size(); i++) {
            Shot shot = mt.shots.get(i);
            if (shot != null && shot.isLive()) {
                for (int j = 0; j < enemyTanks.size(); j++) {
                    EnemyTank enemyTank = enemyTanks.get(j);
                    hitTank(shot, enemyTank);
                }
            } else {
                mt.shots.remove(shot);
            }
        }
    }

    /**
     * 击毁坦克
     *
     * @param shot
     * @param tank
     */
    public void hitTank(Shot shot, Tank tank) {
        //先判断敌方坦克方向
        switch (tank.getDirection()) {
            case 0: //上
            case 2: //下
                //由于坦克的方向朝上、下,基本上位置变化差距不大,写在一起
                if (shot.getX() > tank.getX() && shot.getX() < tank.getX() + 40
                        && shot.getY() > tank.getY() && shot.getY() < tank.getY() + 60) {
                    shot.setLive(false);    //打中敌方坦克,子弹死亡
                    tank.setLive(false);   //坦克被打中,坦克死亡
                    //当我们的坦克击中敌方的坦克后,将该enemyTank 从Vector移除
                    enemyTanks.remove(tank);
                    //创建一个 bomb对象,加入到 bombs 集合
                    Bomb bomb = new Bomb(tank.getX(), tank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1: //左
            case 3: //右
                if (shot.getX() > tank.getX() && shot.getX() < tank.getX() + 60
                        && shot.getY() > tank.getY() && shot.getY() < tank.getY() + 40) {
                    shot.setLive(false);
                    tank.setLive(false);
                    //当我们的坦克击中敌方的坦克后,将该enemyTank 从Vector移除
                    enemyTanks.remove(tank);
                    Bomb bomb = new Bomb(tank.getX(), tank.getY());
                    bombs.add(bomb);
                }
                break;
        }
    }

    /**
     * 击毁我方坦克
     */
    public void hitPlayerTank() {
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                Shot shot = enemyTank.shots.get(j);
                if (mt.isLive() && shot.isLive()){
                    hitTank(shot,mt);
                }
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理 W A S D 键 按下的情况
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            //修改坦克的方向
            mt.setDirection(0);
            //修改坦克的坐标
            if (mt.getY() > Y_MIN) {
                mt.moveUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            mt.setDirection(1);
            if (mt.getX() > X_MIN) {
                mt.moveLeft();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            mt.setDirection(2);
            if (mt.getY() + 60 < Y_MAX) {
                mt.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            mt.setDirection(3);
            if (mt.getX() + 60 < X_MAX) {
                mt.moveRight();
            }
        }
        //如果用户按下的是J,我们启动射击线程
        if (e.getKeyCode() == KeyEvent.VK_J) {
            System.out.println("用户按下了J键,开始发射子弹");
            // 判断子弹是否销毁
//            if (mt.getShot() == null || !mt.getShot().isLive()) {
//                //发射一颗子弹
//                mt.shotEnemyTank();
//            }
            //发射多颗子弹
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
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //是否击中敌方坦克
            hitEnemyTank();
            //是否击中我方坦克
            hitPlayerTank();
            this.repaint();

            //判断是否击中敌方坦克
//            if (mt.getShot() != null && mt.getShot().isLive()) {
//                //遍历敌方坦克，因为我们不知道打中的是哪一辆坦克
//                for (int i = 0; i < enemyTanks.size(); i++) {
//                    EnemyTank enemyTank = enemyTanks.get(i);
//                    //如果我方坦克的子弹,击中了敌方的坦克
//                    hitTank(mt.getShot(), enemyTank);
//                }
//            }
        }
    }
}
