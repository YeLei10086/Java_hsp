package mytank;

import java.util.Vector;

/**
 * @author 叶磊
 * 敌方坦克
 */
public class EnemyTank extends Tank implements Runnable{
    Vector<Shot> shots = new Vector<>();

    //定义一个子弹的对象
    private Shot shot = null;

    //定义一个存放敌方坦克的集合
    Vector<EnemyTank> enemyTanks = new Vector<>();

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    public Shot getShot() {
        return shot;
    }

    public void setShot(Shot shot) {
        this.shot = shot;
    }

    public Vector<EnemyTank> getEnemyTanks() {
        return enemyTanks;
    }

    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        this.enemyTanks = enemyTanks;
    }

    //判断敌方坦克之间是否存在重叠现象
    public boolean toTouchEnemyTank(){
        //获取当前坦克的位置
        switch (this.getDirection()){
            case 0: //上
                //遍历比较一辆坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this){
                        //如果其他坦克的方向是上、下
                        if (enemyTank.getDirection() == 0 || enemyTank.getDirection() == 2){
                            //当前坦克的左上角
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60){
                                return true;
                            }
                            //当前坦克的右上角
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60){
                                return true;
                            }
                        }

                        //如果其他坦克的方向是左、右
                        if (enemyTank.getDirection() == 1 || enemyTank.getDirection() == 3){
                            //当前坦克的左上角
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40){
                                return true;
                            }
                            //当前坦克的右上角
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40){
                                return true;
                            }
                        }
                    }
                }
                break;
            case 1: //左
                //遍历比较一辆坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this){
                        //如果其他坦克的方向是上、下
                        if (enemyTank.getDirection() == 0 || enemyTank.getDirection() == 2){
                            //当前坦克的左上角
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60){
                                return true;
                            }
                            //当前坦克的左下角
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 60){
                                return true;
                            }
                        }

                        //如果其他坦克的方向是左、右
                        if (enemyTank.getDirection() == 1 || enemyTank.getDirection() == 3){
                            //当前坦克的左上角
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40){
                                return true;
                            }
                            //当前坦克的左下角
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 40){
                                return true;
                            }
                        }
                    }
                }
                break;
            case 2: //下
                //遍历比较一辆坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this){
                        //如果其他坦克的方向是上、下
                        if (enemyTank.getDirection() == 0 || enemyTank.getDirection() == 2){
                            //当前坦克的左下角
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 60){
                                return true;
                            }
                            //当前坦克的右下角
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 60){
                                return true;
                            }
                        }

                        //如果其他坦克的方向是左、右
                        if (enemyTank.getDirection() == 1 || enemyTank.getDirection() == 3){
                            //当前坦克的左下角
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 40){
                                return true;
                            }
                            //当前坦克的右下角
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 40){
                                return true;
                            }
                        }
                    }
                }
                break;
            case 3: //右
                //遍历比较一辆坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this){
                        //如果其他坦克的方向是上、下
                        if (enemyTank.getDirection() == 0 || enemyTank.getDirection() == 2){
                            //当前坦克的右上角
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60){
                                return true;
                            }
                            //当前坦克的左下角
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 60){
                                return true;
                            }
                        }

                        //如果其他坦克的方向是左、右
                        if (enemyTank.getDirection() == 1 || enemyTank.getDirection() == 3){
                            //当前坦克的左上角
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40){
                                return true;
                            }
                            //当前坦克的左下角
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 40){
                                return true;
                            }
                        }
                    }
                }
                break;
        }

        return false;
    }

    @Override
    public void run() {
        while (true){
            if (isLive() && shots.size() == 0) {
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
                new Thread(shot).start();
            }

            //获取坦克移动的方向
            switch (getDirection()){
                case 0: //上
                    //移动30个像素换一个位置
                    for (int i = 0; i < 30; i++) {
                        if (getY() > 0 && !toTouchEnemyTank()) {    //没有超过边界值,也没有重叠坦克才可以移动
                            moveUp();
                        }
                        try {
                            //每走一个像素,休眠50ms
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1: //左
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0 && !toTouchEnemyTank()) {
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
                        if (getY() + 60 < 750 && !toTouchEnemyTank()) {
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
                        if (getX() + 60 < 1000 && !toTouchEnemyTank()) {
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
            //设置随机移动的方向
            setDirection((int)(Math.random() * 4));
            //如果坦克死亡,退出
            if (!isLive()){
                break;
            }
        }
    }
}
