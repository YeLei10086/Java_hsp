package object详解;

public class Person {

    public static void main(String[] args) {
        Person person1 = new Person("小明", 18, 'A');
        Person person2 = new Person("小明", 18, 'A');

        // 此时输出的是False, 因为 Person类 继承的是Object的equals , 并没有进行equals重写
        System.out.println(person1.equals(person2));    //False
    }
    private String name;
    private int  age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * 对Object 中的 equals 进行重写
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        //如果比较的两个对象的同一个对象，返回true
        if(this == obj){
            return true;
        }

        if (obj instanceof Person){ // 判断是否是Person
            Person p = (Person) obj;    //向下转型，否则不能调用子类的属性和方法
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }

}
