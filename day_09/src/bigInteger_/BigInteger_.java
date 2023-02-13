package bigInteger_;

import java.math.BigInteger;

/**
 * @author 叶磊
 */
public class BigInteger_ {
    public static void main(String[] args) {
        //当 我们需要保存一个很大的数子时, long已经不够用了，使用BigInteger
        BigInteger bigInteger = new BigInteger("111112222233333444445555566666777778888899999");
        BigInteger bigInteger2 = new BigInteger("5555555555555555555555555555555555");

        System.out.println(bigInteger.add(bigInteger2));        //加
        System.out.println(bigInteger.subtract(bigInteger2));   //减
        System.out.println(bigInteger.multiply(bigInteger2));   //乘
        System.out.println(bigInteger.divide(bigInteger2));     //除
    }
}
