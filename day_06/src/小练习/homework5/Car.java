package 小练习.homework5;

/**
 * @author 叶磊
 */
public class Car {
    private double temperature; //温度

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if (temperature > 40) {
                System.out.println("太热了，吹冷气！");
            }else if (temperature < 0){
                System.out.println("太冷了，吹热气！");
            }else {
                System.out.println("温度正常,关闭空调！");
            }
        }
    }

    //第一种写法
    public Air getAirInstance(){
        return new Air();
    }

    //第二种写法
    public void m1(){
        Air air = new Air();
        air.flow();
    }
}
