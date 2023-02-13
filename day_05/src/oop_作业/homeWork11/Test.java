package oop_作业.homeWork11;

public class Test {
    public static void main(String[] args) {
        Person person = new Student("张三");
        person.eat();
        person.run();

        System.out.println("=================================");

        Student student = (Student) person;
        student.study();
        student.run();
        student.eat();

    }
}
