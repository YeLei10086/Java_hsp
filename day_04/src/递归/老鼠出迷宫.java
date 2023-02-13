package 递归;

public class 老鼠出迷宫 {

    public static void main(String[] args) {

        //思路
        //1. 先创建迷宫，用二维数组表示 int[][] map = new int[8][7];
        //2. 先定义 map 数组的元素值： 0 表示可以走，1 表示不能走;
        int[][] map = new int[8][7];

        //3. 将最上面的一行和最下面的一行，全部设置为1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        //4. 将最右边的一列和最左边的一列，全部设置为1
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        // 迷宫
        map[3][1] = 1;
        map[3][2] = 1;

        //输出当前地图
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
