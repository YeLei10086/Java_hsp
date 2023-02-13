package oop_作业.homeWork11;

public class Student extends Person{

    public Student(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("学生： " + getName() + "  正在奔跑..");
    }

    public void study() {
        System.out.println("学生： " + getName() + "  正在学习..");
    }
}
