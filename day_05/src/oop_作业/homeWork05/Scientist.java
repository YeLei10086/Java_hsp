package oop_作业.homeWork05;

public class Scientist extends Worker{
    private double bonus;

    public Scientist(String name, double salary) {
        super(name, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void allSalary() {
        System.out.println("科学家：" +getName() + " 全年工资=" + (getSalary() * 12 + bonus) );
    }
}

