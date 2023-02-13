package tankgame05;

/**
 * @author 叶磊
 * 发射坦克子弹
 */
public class Shot implements Runnable {
    private int x;  //子弹x坐标
    private int y;  //子弹y坐标
    private int direction = 0;  //子弹发射的方向
    private int speed = 2;  //子弹发射的速度
    private boolean isLive = true;  //子弹是否存活

    public Shot(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    @Override
    public void run() { //射击
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //根据方向来改变子弹的x,y坐标
            switch (direction) {
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
            //测试,输出子弹x,y坐标
//            System.out.println("x = " + x + ", y = " + y);
            //如果子弹超出面板边界值时,表示子弹已经死亡(销毁启动子弹的线程) 并且 子弹已经死亡时
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && isLive)) {
                System.out.println("子弹线程退出...");
                isLive = false;
                break;
            }
        }
    }
}

