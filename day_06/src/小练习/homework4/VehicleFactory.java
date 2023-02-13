package 小练习.homework4;

/**
 * @author 叶磊
 */
public class VehicleFactory {

    //饿汉式写法（静态）：
    //马始终是同一匹马
    private static Horse horse = new Horse();
    //饿汉式写法必须私有化构造器！
    private VehicleFactory() {}

    //这里我们将两个方法都写成static  这样就不需要创建对象调用了。
    public static Horse getHorse(){
        return horse;
    }

    public static Boat getBoat(){
        return new Boat();
    }

}
