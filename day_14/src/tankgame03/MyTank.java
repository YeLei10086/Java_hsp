package tankgame03;

/**
 * @author 叶磊
 */
public class MyTank extends Tank {
    private Shot shot = null;  //定义发射子弹的对象

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
        //启动射击线程
        new Thread(shot).start();
    }

}
