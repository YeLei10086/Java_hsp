package mytank;

/**
 * @author 叶磊
 */
public class Bomb {
    private int x;  //爆炸效果x坐标
    private int y;  //爆炸效果y坐标
    private int life = 12;  //炸弹生命值
    private boolean isLive = true;  //炸弹是否存活

    public Bomb(int x, int y) {
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

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public void downLife(){
        if (life > 0){
            life--;
        }else {
            isLive = false;
        }
    }
}
