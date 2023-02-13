package oop_作业.homeWork05;

public class Waiter extends Teacher{

    public Waiter(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void allSalary() {
        System.out.println("服务员：" + getName() + " 全年工资= " + getSalary() * 12);
    }
}
