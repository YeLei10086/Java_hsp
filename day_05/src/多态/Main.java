package 多态;

public class Main {
    public static void main(String[] args) {
        Master tom = new Master("汤姆");
        Animal animal = new Cat("猫");   //向上转型:父类的引用指向子类的对象
        Food food = new Fish("鱼");      //Food 编译类型  Fish 运行类型

//        Cat cat = new Cat("小花猫");
//        Fish fish = new Fish("鱼");
        tom.feed(animal,food);
    }
}
