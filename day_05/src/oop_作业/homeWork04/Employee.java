package oop_作业.homeWork04;

public class Employee {
    private String name;
    private double one_day_salary;
    private int work_days;
    private double grade;

    public Employee(String name, double one_day_salary, int work_days, double grade) {
        this.name = name;
        this.one_day_salary = one_day_salary;
        this.work_days = work_days;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOne_day_salary() {
        return one_day_salary;
    }

    public void setOne_day_salary(double one_day_salary) {
        this.one_day_salary = one_day_salary;
    }

    public int getWork_days() {
        return work_days;
    }

    public void setWork_days(int work_days) {
        this.work_days = work_days;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void printSalary(){
        System.out.println(name + "工资 = " +(getOne_day_salary() * getWork_days() * getGrade()));
    }
}
