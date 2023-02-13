package oop_作业.homeWork05;

public class Teacher extends Worker{
    private double classSar;

    public Teacher(String name, double salary) {
        super(name, salary);
    }

    public double getClassSar() {
        return classSar;
    }

    public void setClassSar(double classSar) {
        this.classSar = classSar;
    }

    @Override
    public void allSalary() {
        System.out.println("教师：" +getName() + " 全年工资=" + (getSalary() * 12 + (classSar * 20 * 12)));
    }
}
