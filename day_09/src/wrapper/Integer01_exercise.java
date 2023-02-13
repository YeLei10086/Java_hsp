package wrapper;

/**
 * @author 叶磊
 */
public class Integer01_exercise {
    public static void main(String[] args) {
        Double d = 100d; // 自动装箱 valueOf()
        Float f = 1.5f;

        Object obj = true ? new Integer(1):new Double(2.0); //三元运算符是一个整体，而Double的精度更高，因此优先使用精度高的
        System.out.println(obj);    //输出结果？

        Object obj2;
        if (true){
            obj2 = new Integer(1);
        }else {
            obj2 = new Double(2.0);
        }
        System.out.println(obj2);   //输出结果？
    }
}
