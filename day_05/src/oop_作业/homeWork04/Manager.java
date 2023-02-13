package oop_作业.homeWork04;

public class Manager extends Employee{

    private double bonus; // 奖金

    public Manager(String name, double one_day_salary, int work_days, double grade) {
        super(name, one_day_salary, work_days, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSalary() {
        System.out.println("部门经理: "+ getName() +"  工资=" + (bonus + getOne_day_salary() * getWork_days() * getGrade()));
    }
}
