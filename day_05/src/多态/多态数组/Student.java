package 多态.多态数组;

public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say(){
        return "学生类: "+ super.say() + " score = " + score;
    }

    public void study(){
        System.out.println("学生:" + getName() + "正在学习Java课程..");
    }
}
