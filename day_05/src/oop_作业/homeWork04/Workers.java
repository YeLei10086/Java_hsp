package oop_作业.homeWork04;

public class Workers extends Employee{

    public Workers(String name, double one_day_salary, int work_days, double grade) {
        super(name, one_day_salary, work_days, grade);
    }

    @Override
    public void printSalary() {
        System.out.println("普通员工: "+ getName() + "  工资=" + (getOne_day_salary() * getWork_days() * getGrade()));
    }
}
