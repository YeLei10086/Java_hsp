package homework.homework02;

/**
 * @author 叶磊
 */
public class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nname=" + name + '\t' + "price=" + price;
    }
}


