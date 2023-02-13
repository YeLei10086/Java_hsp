package final_;

public class Final04 {
    public static void main(String[] args) {
        //如果类不是final类,但是含有final方法,则该方法虽然不能进行重写，但是可以被继承
        new Student("张三").run();
    }
}

/**
 *  如果类不是final类,但是含有final方法,则该方法虽然不能进行重写，但是可以被继承
 */
class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public final void run(){
        System.out.println(name + "正在跑步...");
    }
}

class Student extends Person{

    public Student(String name) {
        super(name);
    }
}
