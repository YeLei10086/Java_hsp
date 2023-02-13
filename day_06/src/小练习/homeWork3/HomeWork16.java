package 小练习.homeWork3;

/**
 * @author 叶磊
 */
public class HomeWork16 {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }
}

class A{

    private String NAME = "李四";

    public void m1(){
        class B{
            private final String NAME = "张三";
            public void show(){
                System.out.println(NAME + "   外部类的 = " + A.this.NAME);
            }
        }

        B b = new B();
        b.show();
    }
}