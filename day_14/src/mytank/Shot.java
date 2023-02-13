package mytank;

/**
 * @author 叶磊
 */
public class Shot implements Runnable {
    private int x;  //子弹的x坐标
    private int y;  //子弹的y坐标
    private int direction;  //子弹发射的方向
    private int speed = 2;  //子弹的速度
    private boolean isLive = true; //子弹是否存活

    public Shot(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //获取子弹的方向
            switch (getDirection()) {
                case 0: //上
                    y -= speed;
                    break;
                case 1: //左
                    x -= speed;
                    break;
                case 2: //下
                    y += speed;
                    break;
                case 3: //右
                    x += speed;
                    break;
            }
//            System.out.println("x = " + x + ",y = " + y);
            //如果子弹超出面板范围,说明子弹死亡
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750) || !isLive) {
                isLive = false;
                System.out.println("子弹消失");
                break;
            }
        }
    }
}
