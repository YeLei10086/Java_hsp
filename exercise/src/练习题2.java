public class 练习题2 {
    /**
     * 求出1-1/2+1/3-1/4+1/....../100的和
     *
     * 思路：
     *  1-1/2+1/3-1/4+1/....../100  等价于 （1/1）-（1/2）+（1/3）-（1/4）......（1/100）
     *  规律：
     *      共有100项，每一项的分子1，分母是从1，2，3，4，......100
     *      奇数项是正数，偶数项是负数
     * @param args
     */
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 != 0){    //奇数项
//                System.out.printf("%d / %d\n",1,i);
                sum += 1.0/i;
            }else{
//                System.out.printf("-%d / %d\n",1,i);
                sum -= 1.0/i;
            }
        }
        System.out.printf("sum = %.2f",sum);
    }
}
