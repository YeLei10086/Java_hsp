package 小练习.homework4;

/**
 * @author 叶磊
 */
public class Person {
    private String name;
    private IVehicles iVehicles;

    //在创建人对象时,事先会给人分配一个交通工具
    public Person(String name, IVehicles iVehicles) {
        this.name = name;
        this.iVehicles = iVehicles;
    }

    //思考？如何不浪费构造器中 事先分配给人的那个交通工具？
    //答：对交通工具进行判断，如果有了对应的交通工具则直接调用方法，否则，我们再去获取对应的交通工具
    public void common() {
        // iVehicles instanceof Horse 判断当前的 iVehicles 是不是 Horse  有三层含义：
        // 1、 iVehicles == null   :  iVehicles instanceof Horse  =>  false
        // 2、 iVehicles == Boat   :  iVehicles instanceof Horse  =>  false
        // 3、 iVehicles == Horse  :  iVehicles instanceof Horse  =>  true
        if (iVehicles instanceof Horse){
             iVehicles = VehicleFactory.getHorse();
        }
        iVehicles.work();
    }

    public void passRiver(){
        if (iVehicles instanceof Boat){
            iVehicles = VehicleFactory.getBoat();
        }
        iVehicles.work();
    }
}
