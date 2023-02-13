package tankgame06;

import java.util.Vector;

import static tankgame05.MyPanel.*;

/**
 * @author 叶磊
 * 敌方坦克
 */
public class EnemyTank extends Tank implements Runnable {

    //在敌人坦克类,使用 Vector 保存多个Shot
    Vector<Shot> shots = new Vector<>();

    private Shot shot = null;  //定义发射子弹的对象

    //定义一个EnemyTank的集合，用于存放敌方坦克数量
    Vector<EnemyTank> enemyTanks = new Vector<>();

    public Shot getShot() {
        return shot;
    }

    public void setShot(Shot shot) {
        this.shot = shot;
    }

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    public Vector<EnemyTank> getEnemyTanks() {
        return enemyTanks;
    }

    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        this.enemyTanks = enemyTanks;
    }

    //判断当前this.enemyTank 是否撞击到或者重叠 敌方的其他坦克
    public boolean isTouchEnemyTank() {
        //获取当前敌方坦克的位置
        switch (this.getDirection()) {
            case 0: //上
                //遍历获取 EnemyTank 中的一辆坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this) {
                        //如果与敌方其他的坦克发生了碰撞或重叠（上下）
                        //如果敌人的坦克是上/下
                        //x轴范围 [enemyTank.getX(),enemyTank.getX() + 40]
                        //y轴范围 [enemyTank.getY(),enemyTank.getY() + 60]
                        if (enemyTank.getDirection() == 0 || enemyTank.getDirection() == 2) {
                            //当前坦克的左上角坐标 [this.getX(),this.getY()]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }

                            //当前坦克的右上角坐标 [this.getX() + 40,this.getY()]
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果与敌方其他的坦克发生了碰撞或重叠（左右）
                        //如果敌人的坦克是左/右
                        //x轴范围 [enemyTank.getX(),enemyTank.getX() + 60]
                        //y轴范围 [enemyTank.getY(),enemyTank.getY() + 40]
                        if (enemyTank.getDirection() == 1 || enemyTank.getDirection() == 3) {
                            //当前坦克的左上角坐标 [this.getX(),this.getY()]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }

                            //当前坦克的右上角坐标 [this.getX() + 40,this.getY()]
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;    //碰撞
                            }
                        }
                    }
                }
                break;
            case 1: //左
                //遍历获取 EnemyTank 中的一辆坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this) {
                        //如果与敌方其他的坦克发生了碰撞或重叠（上下）
                        //如果敌人的坦克是上/下
                        //x轴范围 [enemyTank.getX(),enemyTank.getX() + 40]
                        //y轴范围 [enemyTank.getY(),enemyTank.getY() + 60]
                        if (enemyTank.getDirection() == 0 || enemyTank.getDirection() == 2) {
                            //当前坦克的左上角坐标 [this.getX(),this.getY()]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }

                            //当前坦克的左下角坐标 [this.getX(),this.getY() + 40]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果与敌方其他的坦克发生了碰撞或重叠（左右）
                        //如果敌人的坦克是左/右
                        //x轴范围 [enemyTank.getX(),enemyTank.getX() + 60]
                        //y轴范围 [enemyTank.getY(),enemyTank.getY() + 40]
                        if (enemyTank.getDirection() == 1 || enemyTank.getDirection() == 3) {
                            //当前坦克的左上角坐标 [this.getX(),this.getY()]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }

                            //当前坦克的左下角坐标 [this.getX(),this.getY() + 40]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;    //碰撞
                            }
                        }
                    }
                }
                break;
            case 2: //下
                //遍历获取 EnemyTank 中的一辆坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this) {
                        //如果与敌方其他的坦克发生了碰撞或重叠（上下）
                        //如果敌人的坦克是上/下
                        //x轴范围 [enemyTank.getX(),enemyTank.getX() + 40]
                        //y轴范围 [enemyTank.getY(),enemyTank.getY() + 60]
                        if (enemyTank.getDirection() == 0 || enemyTank.getDirection() == 2) {
                            //当前坦克的左下角坐标 [this.getX(),this.getY() + 60]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 60) {
                                return true;
                            }

                            //当前坦克的右下角坐标 [this.getX() + 40,this.getY() + 60]
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果与敌方其他的坦克发生了碰撞或重叠（左右）
                        //如果敌人的坦克是左/右
                        //x轴范围 [enemyTank.getX(),enemyTank.getX() + 60]
                        //y轴范围 [enemyTank.getY(),enemyTank.getY() + 40]
                        if (enemyTank.getDirection() == 1 || enemyTank.getDirection() == 3) {
                            //当前坦克的左上角坐标 [this.getX(),this.getY() + 60]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 40) {
                                return true;
                            }

                            //当前坦克的右上角坐标 [this.getX() + 40,this.getY() + 60]
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 40) {
                                return true;    //碰撞
                            }
                        }
                    }
                }
                break;
            case 3: //右
                //遍历获取 EnemyTank 中的一辆坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this) {
                        //如果与敌方其他的坦克发生了碰撞或重叠（上下）
                        //如果敌人的坦克是上/下
                        //x轴范围 [enemyTank.getX(),enemyTank.getX() + 40]
                        //y轴范围 [enemyTank.getY(),enemyTank.getY() + 60]
                        if (enemyTank.getDirection() == 0 || enemyTank.getDirection() == 2) {
                            //当前坦克的右上角坐标 [this.getX() + 60,this.getY()]
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }

                            //当前坦克的右下角坐标 [this.getX() + 60,this.getY() + 40]
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果与敌方其他的坦克发生了碰撞或重叠（左右）
                        //如果敌人的坦克是左/右
                        //x轴范围 [enemyTank.getX(),enemyTank.getX() + 60]
                        //y轴范围 [enemyTank.getY(),enemyTank.getY() + 40]
                        if (enemyTank.getDirection() == 1 || enemyTank.getDirection() == 3) {
                            //当前坦克的右上角坐标 [this.getX() + 60,this.getY()]
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }

                            //当前坦克的右下角坐标 [this.getX() + 60,this.getY() + 40]
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;    //碰撞
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
        while (true) {
            //这里我们判断如果 shots.size == 0,创建一颗子弹
            if (isLive() && shots.size() == 0) {
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
                //放入到shots集合,并启动
                shots.add(shot);
                //启动射击线程
                new Thread(shot).start();
            }

            //获取敌方坦克方向
            switch (getDirection()) {
                case 0: //上
                    //让坦克保持一个方向 走15步
                    for (int i = 0; i < 30; i++) {
                        if (getY() > Y_MIN && !isTouchEnemyTank()) {    //不大于边界值,并且没有重叠现象
                            moveUp();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1: //左
                    for (int i = 0; i < 30; i++) {
                        if (getX() > X_MIN && !isTouchEnemyTank()) {
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
                        if (getY() + 60 < Y_MAX && !isTouchEnemyTank()) {
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
                        if (getX() + 60 < X_MAX && !isTouchEnemyTank()) {
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
            //随机敌方坦克的 上 左 下 右 方向
            setDirection((int) (Math.random() * 4));
            //如果敌方坦克死亡了,退出
            if (!isLive()) {
                break;
            }
        }
    }
}
