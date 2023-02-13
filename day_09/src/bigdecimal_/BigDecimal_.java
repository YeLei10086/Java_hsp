package bigdecimal_;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author 叶磊
 */
public class BigDecimal_ {
    public static void main(String[] args) {
        //当 我们需要保存一个精度很高的值时,double已经不够用了，使用BigDecimal
        BigDecimal bigDecima = new BigDecimal("1998.54654564564654144444");
        BigDecimal bigDecima2 = new BigDecimal("1.9213156");

        System.out.println(bigDecima.add(bigDecima2));      //加
        System.out.println(bigDecima.subtract(bigDecima2));      //减
        System.out.println(bigDecima.multiply(bigDecima2));      //乘
        // 这里除不尽的话，会一直除进入死循环，因此需要加RoundingMode.CEILING ，不加会报错ArithmeticException
        System.out.println(bigDecima.divide(bigDecima2, RoundingMode.CEILING));      //除
    }
}
