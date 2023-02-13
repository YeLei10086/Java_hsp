package 多态.多态练习;

public class Works extends Employee{

    public Works(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("员工 " + getName() + "正在努力干活..");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
