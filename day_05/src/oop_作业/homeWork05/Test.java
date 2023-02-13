package oop_作业.homeWork05;

public class Test {
    public static void main(String[] args) {
        Waiter worker = new Waiter("张山",3000);
        Teacher  teacher = new Teacher("张山",3000);
        teacher.setClassSar(20);
        Scientist scientist = new Scientist("张山",3000);
        scientist.setBonus(10000);

        worker.allSalary();
        teacher.allSalary();
        scientist.allSalary();

    }
}
