package mytank;

/**
 * @author 叶磊
 * 所有坦克的父类
 */
public class Tank {
    private int x;  //坦克的横坐标
    private int y;  //坦克的纵坐标
    private int direction;  //将自定义方法中的direction定义成变量,实现对按键进行监听
    //定义一个速度变量,为坦克的移动加速
    private int speed = 1;  //默认速度为1
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
    //对坦克的移动,封装到方法中
    public void moveUp(){
        y -= speed;
    }

    public void moveLeft(){
        x -= speed;
    }

    public void moveDown(){
        y += speed;
    }

    public void moveRight(){
        x += speed;
    }
}
