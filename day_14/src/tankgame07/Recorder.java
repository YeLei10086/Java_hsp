package tankgame07;

import java.io.*;
import java.util.Vector;

/**
 * @author 叶磊
 * 用于记录击毁坦克的数量,保存到文件中
 */
public class Recorder {
    //用来记录击毁敌方坦克的数量
    private static int shotEnemyTankNum = 0;
    //定义文件存放的位置
    private static BufferedWriter bw = null;
    private static BufferedReader br = null;
    private static String recordFile = "day_14\\src\\recordEnemyTank.txt";
    //获取敌方坦克的Vector
    private static Vector<EnemyTank> enemyTanks = null;
    //通过node结点,恢复敌方坦克的位置和方向
    private static Vector<Node> nodes = new Vector<>();

    public static int getShotEnemyTankNum() {
        return shotEnemyTankNum;
    }

    public static void setShotEnemyTankNum(int shotEnemyTankNum) {
        Recorder.shotEnemyTankNum = shotEnemyTankNum;
    }

    public static int getAllEnemyTank() {
        return shotEnemyTankNum;
    }

    public static void setAllEnemyTank(int allEnemyTank) {
        Recorder.shotEnemyTankNum = allEnemyTank;
    }

    public static Vector<EnemyTank> getEnemyTanks() {
        return enemyTanks;
    }

    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        Recorder.enemyTanks = enemyTanks;
    }

    public static String getRecordFile() {
        return recordFile;
    }

    public static void setRecordFile(String recordFile) {
        Recorder.recordFile = recordFile;
    }

    //一个累加击毁坦克数据的方法
    public static void addAllEnemyTank() {
        Recorder.shotEnemyTankNum++;
    }

    //读取信息
    public static Vector<Node> tanksNodesAndShotEnemyTankNum() {
        try {
            br = new BufferedReader(new FileReader(recordFile));
            shotEnemyTankNum = Integer.parseInt(br.readLine());
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] split = line.split(" ");
                Node node = new Node(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
                nodes.add(node);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return nodes;
    }

    //保存信息
    public static void keepRecordInfo() {
        try {
            bw = new BufferedWriter(new FileWriter(recordFile));
            bw.write(shotEnemyTankNum + "\r\n");
            //遍历敌方坦克,获取其x,y坐标和方向
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                if (enemyTank.isLive()) {
                    bw.write(enemyTank.getX() + " " + enemyTank.getY() + " " + enemyTank.getDirection() + "\r\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
