package exercise;


/**
 * @author 叶磊
 */
public class Test01 {
    public static void main(String[] args) {
        int[][] n = new int[10][];  //打印一个10行的杨辉三角
        //遍历
        for (int i = 0; i < n.length; i++) {    //输出行
            n[i] = new int[i + 1];    //填充二维数组
            for (int j = 0; j < n[i].length; j++) { //输出列
                if (j == 0 || j == n[i].length-1){  //如果是第一个数和最后一个数
                    n[i][j] = 1;    //全部重置为1
                }else{
                    n[i][j] = n[i-1][j] + n[i-1][j-1];  //否则执行杨辉三角公式
                }
            }
        }

        //打印输出
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
