package final_;

public class Final03 {
    public static void main(String[] args) {

    }
}

class AAA{

    // 如果final修饰的属性是static的,则初始化的位置只能是：
    //  1、定义时   2、在静态代码块中
    //  不能在构造器中赋值！！！

    public static final double TAX_RATE = 0.08;    //1、定义时赋值
    public static final double TAX_RATE2;
//    public static final double TAX_RATE3;

    static {
        TAX_RATE2 = 3.5;    //2、在静态代码块中赋值
    }

//    public AAA() {
//        TAX_RATE3 = 1.5;   // 不能在构造器中赋值
//    }
}
