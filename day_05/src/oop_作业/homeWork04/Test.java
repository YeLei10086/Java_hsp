package oop_作业.homeWork04;

public class Test {
    public static void main(String[] args) {
        Workers workers = new Workers("张三", 200, 20, 1.0);
        workers.printSalary();

        Manager  manager = new Manager("李四", 300, 20, 1.2);
        //奖金逐年递增，因此自设
        manager.setBonus(3000);
        manager.printSalary();
    }
}
