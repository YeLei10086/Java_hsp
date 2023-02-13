package oop_作业.homeWork11;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println(name + "  正在奔跑..");
    }

    public void eat(){
        System.out.println(name + "  正在吃东西..");
    }
}
