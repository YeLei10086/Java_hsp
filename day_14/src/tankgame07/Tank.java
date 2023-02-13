package tankgame07;

/**
 * @author 叶磊
 * 坦克父类
 */
public class Tank {
    private int x;
    private int y;
    private int direction;  //将原先的坦克方向做成变量,方便监听 (1上 2左 3下 4右)
    //坦克速度每次 -1,太慢了？ 定义一个speed变量,起飞
    private int speed = 1;
    //添加一个坦克是否存活的变量
    private boolean isLive = true;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
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

    //定义方法,改变坦克坐标
    public void moveUp() {
        y -= speed;
    }

    public void moveLeft() {
        x -= speed;
    }

    public void moveDown() {
        y += speed;
    }

    public void moveRight() {
        x += speed;
    }

}
