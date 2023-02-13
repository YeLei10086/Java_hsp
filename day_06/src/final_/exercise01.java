package final_;

public class exercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println(circle.getArea());
    }
}

class Circle{
    private double radius;
    //private final double PI = 3.14;  第一种赋值方式
    private final double PI;

    {
        PI = 3.14;  // 第三种赋值方式
    }

    public Circle(double radius) {
        //PI = 3.14;  //第二种 赋值方式
        this.radius = radius;
    }

    public double getArea(){
        return PI * radius * radius;
    }
}
