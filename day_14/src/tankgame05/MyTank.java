package tankgame05;

import java.util.Vector;

/**
 * @author 叶磊
 * 玩家坦克
 */
public class MyTank extends Tank {
    private Shot shot = null;  //定义发射子弹的对象

    //创建一个子弹集合.发射多颗子弹
    Vector<Shot> shots = new Vector<>();

    public Shot getShot() {
        return shot;
    }

    public void setShot(Shot shot) {
        this.shot = shot;
    }

    public MyTank(int x, int y) {
        super(x, y);
    }

    public void shotEnemyTank() {
        //发射多颗子弹,但最多只有5颗
            if (shots.size() == 5){
                return;
            }
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
            //将子弹加入 Vector
            shots.add(shot);
            //启动射击线程
            new Thread(shot).start();
    }
}
