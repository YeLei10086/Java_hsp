package tankgame05;

import java.util.Vector;

import static tankgame05.MyPanel.*;

/**
 * @author 叶磊
 * 敌方坦克
 */
public class EnemyTank extends Tank implements Runnable {

    //在敌人坦克类,使用 Vector 保存多个Shot
    Vector<Shot> shots = new Vector<>();

    private Shot shot = null;  //定义发射子弹的对象

    //添加一个敌方坦克是否还存活的变量
    private boolean isLife = true;

    public Shot getShot() {
        return shot;
    }

    public void setShot(Shot shot) {
        this.shot = shot;
    }

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true) {
            //这里我们判断如果 shots.size == 0,创建一颗子弹
            if (isLife && shots.size() == 0) {
                switch (getDirection()) {    //获取坦克的方向
                    case 0: //上
                        //获取当前的坦克位置和方向,创建一个 new Shot()
                        shot = new Shot(getX() + 20, getY(), 0);
                        break;
                    case 1: //左
                        shot = new Shot(getX(), getY() + 20, 1);
                        break;
                    case 2: //下
                        shot = new Shot(getX() + 20, getY() + 60, 2);
                        break;
                    case 3: //右
                        shot = new Shot(getX() + 60, getY() + 20, 3);
                }
                //放入到shots集合,并启动
                shots.add(shot);
                //启动射击线程
                new Thread(shot).start();
            }

            //获取敌方坦克方向
            switch (getDirection()) {
                case 0: //上
                    //让坦克保持一个方向 走15步
                    for (int i = 0; i < 30; i++) {
                        if (getY() > Y_MIN) {
                            moveUp();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1: //左
                    for (int i = 0; i < 30; i++) {
                        if (getX() > X_MIN) {
                            moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2: //下
                    for (int i = 0; i < 30; i++) {
                        if (getY() + 60 < Y_MAX ) {
                            moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    break;
                case 3: //右
                    for (int i = 0; i < 30; i++) {
                        if (getX() + 60 < X_MAX) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }
            //随机敌方坦克的 上 左 下 右 方向
            setDirection((int) (Math.random() * 4));
            //如果敌方坦克死亡了,退出
            if (!isLife) {
                break;
            }
        }
    }
}
