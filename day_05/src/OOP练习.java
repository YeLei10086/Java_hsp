public class OOP练习 {

    public static void main(String[] args) {
        Person p = new Person("Tom",20);
        Person p2 = new Person("Tom",30);
        System.out.println(p.comparaTo(p2));
    }

}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean comparaTo(Person person){
        return name.equals(person.name) && age == person.age;
    }
}