package generic;

import java.util.*;

/**
 * @author 叶磊
 */
public class GenericExercise {
    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<>();
        students.add(new Student("张三",18));
        students.add(new Student("李四",20));
        students.add(new Student("王五",22));

        System.out.println("HashSet：增强for遍历");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nHashSet：迭代器遍历");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student =  iterator.next();
            System.out.println(student);
        }


        HashMap studentHashMap = new HashMap<String,Student>();
        studentHashMap.put("张三",new Student("张三",18));
        studentHashMap.put("李四",new Student("李四",20));
        studentHashMap.put("王五",new Student("王五",22));

        System.out.println("\nHashMap entrySet：迭代器遍历");
        Set<Map.Entry<String,Student>> entrySet = studentHashMap.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String,Student> entry = (Map.Entry<String, Student>) iterator1.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nHashMap keySet：迭代器遍历");
        Set keySet = studentHashMap.keySet();
        Iterator iterator2 = keySet.iterator();
        while (iterator2.hasNext()) {
            String key = (String) iterator2.next();
            System.out.println(key + " - " + studentHashMap.get(key));
        }


    }
}

class Student{
    private String name;
    private int age;

    public Student(String name,int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "name=" + name + '\t' +"age=" + age;
    }
}
