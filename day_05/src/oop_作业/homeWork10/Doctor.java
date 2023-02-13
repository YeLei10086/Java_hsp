package oop_作业.homeWork10;

public class Doctor {

    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("张三", 20, "牙医", '男', 3000);
        Doctor doctor2 = new Doctor("张三", 20, "牙医", '男', 3000);
        System.out.println(doctor1.equals(doctor2));
    }

    private String name;
    private int age;
    private String job;
    private char gender;   // 性别
    private double salary;

    public Doctor(String name, int age, String job, char gender, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * 重写 父类（Object）中的方法，进行验证值是否相等
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (!(obj instanceof Doctor)){
            return false;
        }

        Doctor doctor = (Doctor) obj;
        return this.name.equals(doctor.getName()) && this.age == doctor.getAge() && this.job.equals(doctor.getJob())
                && this.gender == doctor.getGender() && this.salary == doctor.getSalary();
    }
}
