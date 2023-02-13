package codeBlock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
//        //类什么时候被加载【重要！】
//        //①创建对象实例时 （指 new一个对象）
//        new Person("李焕英","工人");
//        //②创建子类对象实例,父类也会被加载
//        new Student("英子");
//        //③使用类的静态成员时
//        Teacher.count++;
//        System.out.println(Teacher.count);

        //普通代码块，在创建对象实例时，会被隐式调用。
        //被创建一次 ,就调用一次
        //如果只是使用静态成员时,普通代码块并不会执行
        System.out.println(Person.num);
    }
}

class Person{
    private String name;
    private String job;
    public static int num = 0;

    /**
     * static代码块也叫静态代码块，作用：
     *      对类进行初始化，而且它随着 类的加载 而执行， 并且 只会执行一次
     *      如果是普通的代码块( 没有static 关键字)，每创建一个对象，就会执行一次代码块中的内容
     *
     *  代码块执行顺序 高于 构造器！！！
     */
    static {
        System.out.println("(父类)无论创建几次新对象,我只执行一次！");
    }

    {
        System.out.println("每次创建新对象,我都执行一次！");
    }

    public Person(String name) {
        System.out.println("String name  被执行..");
        this.name = name;
    }

    public Person(String name, String job) {
        System.out.println("String name, String job  被执行..");
        this.name = name;
        this.job = job;
    }
}

class Student extends Person{

    static {
        System.out.println("(子类)无论创建几次新对象,我只执行一次！");
    }

    public Student(String name) {
        super(name);
    }

    public Student(String name, String job) {
        super(name, job);
    }
}

class Teacher{

    public static int count = 0;

    static {
        System.out.println("(静态成员)无论创建几次新对象,我只执行一次！");
    }
}