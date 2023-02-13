package oop_作业.homeWork13;

public class Student extends Person{
    private int stu_id;

    public Student(String name, int age, char gender, int stu_id) {
        super(name, age, gender);
        this.stu_id = stu_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println(getName() + "：我承诺,我会好好学习！");
    }

    @Override
    public String play() {
        return super.play() + "足球！";
    }

    public void Info(){
        System.out.println("学生的信息：");
        System.out.println(basicInfo());
        System.out.println("学号：" + stu_id);
        study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id=" + stu_id +
                '}' + super.toString();
    }
}
