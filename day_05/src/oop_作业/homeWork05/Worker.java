package oop_作业.homeWork05;

public class Worker {
    private String name;
    private double salary;

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void allSalary(){
        System.out.println("姓名 ：" +name + " 全年工资= " + salary * 12);
    }
}
