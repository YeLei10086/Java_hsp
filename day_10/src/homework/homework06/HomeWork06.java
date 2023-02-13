package homework.homework06;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 叶磊
 */
public class HomeWork06 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Person p1 = new Person(1001, "AA");
        Person p2 = new Person(1002, "BB");
        hashSet.add(p1);
        hashSet.add(p2);
        p1.name = "CC";
        hashSet.remove(p1);
        System.out.println(hashSet);
        hashSet.add(new Person(1003,"CC"));
        System.out.println(hashSet);
        hashSet.add(new Person(1004,"AA"));
        System.out.println(hashSet);

    }
}

class Person{
    public String name;
    public int id;

    public Person(int id,String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}