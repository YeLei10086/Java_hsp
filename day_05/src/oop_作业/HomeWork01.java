package oop_作业;

public class HomeWork01 {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("张三",22,"工程师");
        person[1] = new Person("李四",19,"测试");
        person[2] = new Person("王五",30,"架构师");

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }

        System.out.println("排序后的效果..");

        Person temp = null;
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[j].getAge() < person[j+1].getAge()){
                    temp = person[j];
                    person[j] = person[j+1];
                    person[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }
}

class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
