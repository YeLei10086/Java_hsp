package set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 叶磊
 */
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Employee zs = new Employee("张三", 18);
        Employee ls = new Employee("李四", 18);
        Employee zs2 = new Employee("张三", 18);
        hashSet.add(zs);
        hashSet.add(ls);
        hashSet.add(zs2);
        System.out.println(hashSet);
    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}