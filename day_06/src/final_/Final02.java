package final_;

public class Final02 {
    public static void main(String[] args) {

    }
}

class AA{

    // final 修饰的属性在定义时的三种赋值方法；
    public final double TAX_RATE = 0.08;    //1、定义时赋值
    public final double TAX_RATE2;
    public final double TAX_RATE3;

    {
        TAX_RATE3 = 3.5;    //3、代码块中赋值
    }

    public AA() {
         TAX_RATE2 = 1.5;   //2、构造器中赋值
    }
}
