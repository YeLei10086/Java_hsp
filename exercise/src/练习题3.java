public class 练习题3 {
    /**
     * 求出1+（1+2）+（1+2+3）+（1+2+3+4）+...+(1+2+3+...+100)的结果
     *
     * 思路：
     *      一共有100个数
     *      1
     *      1，2
     *      1，2，3
     *      1，2，3，4
     *
     *  需要循环控制 每一项的个数
     *
     * @param args
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            for (int j = 1; j <= i ; j++) {
                sum += j;
            }
        }
        System.out.println("sum = "+sum);
    }
}
