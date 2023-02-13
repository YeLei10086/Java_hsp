package 重载;

public class Student extends Person{
    private int id;
    private int score;

    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score >= 0 && score <= 150) {
            this.score = score;
        }else {
            System.out.println("成绩有误！范围（0-150分之间）");
        }
    }

    @Override
    public String say(){
        return super.say() + " ,id: " + id + ", 成绩："+ score;
    }
}
