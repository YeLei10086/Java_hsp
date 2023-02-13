public class 数组 {
    /**
     * 农场有6只鸡  体重分别为：3kg,5kg,1kg,3.4kg,2kg,50kg
     * 求6只鸡的总体重、平均值
     * @param args
     */
    public static void main(String[] args) {

        double[] hens = {3,5,1,3.4,2,50};
        double sumTotal = 0.0;

        for (int i = 0; i < hens.length ; i++) {
                sumTotal += hens[i];
        }
        System.out.println("总体重 = " + sumTotal);
        System.out.printf("平均体重 = %.2f\n",(sumTotal / hens.length));
    }
}
