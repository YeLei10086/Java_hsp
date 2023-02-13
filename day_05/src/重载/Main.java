package 重载;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("张三",20);
        System.out.println(person.say());

        Student student = new Student("李四",30,101,100);
        System.out.println(student.say());
    }
}
