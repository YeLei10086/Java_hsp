package tankgame04;

import java.util.Vector;

import static tankgame04.MyPanel.*;

/**
 * @author 叶磊
 * 敌方坦克
 */
public class EnemyTank extends Tank implements Runnable {
    //在敌人坦克类,使用 Vector 保存多个Shot
    Vector<Shot> shots = new Vector<>();
    //添加一个敌方坦克是否还存活的变量
    private boolean isLive = true;

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true) {
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
            if (!isLive) {
                break;
            }
        }
    }
}
