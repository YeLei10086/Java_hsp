public class 杨辉三角 {

    public static void main(String[] args) {

        int[][] yangHui = new int[5][];

        for (int i = 0; i < yangHui.length; i++) {
            //给每一个一维数组分配空间
            yangHui[i] = new int[i + 1];
            for (int j = 0; j < yangHui[i].length; j++) {
                //如果是第一个元素或者最后一个元素   设置 = 1
                if (j == 0 || j == yangHui[i].length - 1){
                    yangHui[i][j] = 1;
                }else{
                    yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1];
                }
            }
        }
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
