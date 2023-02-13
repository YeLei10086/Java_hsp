package 多态;

public class Master {
    private String name;

    public Master() {
    }

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed(Animal animal,Food food){
        System.out.println("主人 " + name + "给" + animal.getName() + "喂食" + food.getName());
    }
}
