package tankgame07;

/**
 * @author 叶磊
 * 爆炸效果
 */
public class Bomb {
    private int x;  //爆炸效果的x坐标
    private int y;  //爆炸效果的y坐标
    private int life = 12;   //炸弹的生命周期值
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

    //炸弹生命值不断减少,直至死亡
    public void downLife(){
        if (life > 0){
            life--;
        }else {
            isLive = false;
        }
    }
}
