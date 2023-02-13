package 重载;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        }else{
            System.out.println("名字不符合要求（长度为2-6之间）");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        }else {
            System.out.println("输入有误！范围（0-120岁之间）");
        }
    }

    public String say(){
        return "我的名字："+ name + ",年龄：" + age;
    }
}
