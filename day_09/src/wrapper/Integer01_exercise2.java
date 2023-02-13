package wrapper;

/**
 * @author 叶磊
 */
public class Integer01_exercise2 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i == i2);

        /**
         *      This method will always cache values in the range -128 to 127,
         *      inclusive, and may cache other values outside of this range.
         *
         *      public static Integer valueOf ( int i){
         *      if (i >= IntegerCache.low && i <= IntegerCache.high)
         *          return IntegerCache.cache[i + (-IntegerCache.low)];
         *          return new Integer(i);
         *      }
         */
        Integer n = 1;  //会使用valueOf()自动装箱      如果值在-128 to 127区间内，不 new Integer()对象
        Integer m = 1;
        System.out.println(n == m); //true

        Integer a = 128;    //如果值不在-128 to 127区间内，new Integer()对象
        Integer b = 128;
        System.out.println(a == b); //false
    }
}
