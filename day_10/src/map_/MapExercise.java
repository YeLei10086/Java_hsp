package map_;

import java.util.*;

/**
 * @author 叶磊
 */
public class MapExercise {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1001, new Employee("张三", 30000, 1001));
        hashMap.put(1002, new Employee("李四", 5000, 1002));
        hashMap.put(1003, new Employee("王五", 18500, 1003));
        hashMap.put(1004,"测试");

        //全部迭代
        System.out.println("keySet:根据key 迭代全部类型");
        Set keySet = hashMap.keySet();
        for (Object key : keySet) {
            Object object = hashMap.get(key);
            System.out.println(object);
        }

        //条件迭代
        //keySet
        System.out.println("keySet: 根据条件key 迭代对应类型");
        keySet = hashMap.keySet();
        for (Object key : keySet) {
            Object object = hashMap.get(key);
            if (object instanceof Employee){
                Employee emp = (Employee) object;
                if (emp.getSalary() > 18000){
                    System.out.println(emp);
                }
            }
        }

        System.out.println("entrySet: 根据key 迭代全部类型");
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object entry =  iterator.next();
            Map.Entry entry2 = (Map.Entry) entry;
            System.out.println(entry2);
        }

        //keySet
        System.out.println("entrySet: 根据条件key 迭代对应类型");
        entrySet = hashMap.entrySet();
        for (Object object : entrySet) {
            Map.Entry me = (Map.Entry) object;
            Object value = me.getValue();
            if (value instanceof Employee){
                Employee emp2 = (Employee) value;
                if (emp2.getSalary() > 18000){
                    System.out.println(emp2);
                }
            }
        }

    }
}

class Employee {
    private String name;
    private double salary;
    private int num;

    public Employee(String name, double salary, int num) {
        this.name = name;
        this.salary = salary;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "name = " + name + " \tsalary = " + salary + " \tnum = " + num;
    }
}
