package mytank;

import java.util.Vector;

/**
 * @author 叶磊
 * 玩家坦克类
 */
public class MyTank extends Tank {
    //定义一个子弹的对象
    private Shot shot = null;
    //定义一个子弹集合，存放多颗子弹
    Vector<Shot> shots = new Vector<>();

    public MyTank(int x, int y) {
        super(x, y);
    }

    public Shot getShot() {
        return shot;
    }

    public void setShot(Shot shot) {
        this.shot = shot;
    }

    public void shotEnemyTank() {
            if (shots.size() == 5) {
                return;
            }
            //首先，先获取坦克的方向和位置
            switch (getDirection()) {
                case 0: //上
                    shot = new Shot(getX() + 20, getY(), 0);  //根据坦克的位置设置子弹发射的位置
                    break;
                case 1: //左
                    shot = new Shot(getX(), getY() + 20, 1);
                    break;
                case 2: //下
                    shot = new Shot(getX() + 20, getY() + 60, 2);
                    break;
                case 3: //右
                    shot = new Shot(getX() + 60, getY() + 20, 3);
                    break;
            }
            shots.add(shot);
            new Thread(shot).start();   //启动发射子弹线程
    }
}
