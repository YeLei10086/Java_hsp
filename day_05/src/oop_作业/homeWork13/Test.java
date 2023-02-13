package oop_作业.homeWork13;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("张三",18,'男',10);
        teacher.Info();

        Student student = new Student("张三",18,'男',1001);
        System.out.println("-----------------------------");
        student.Info();

        Person[] person = new Person[4];
        person[0] = new Teacher("张三",30,'男',5);
        person[1] = new Teacher("李四",40,'男',15);
        person[2] = new Student("小明",18,'男',1001);
        person[3] = new Student("小红",19,'女',1007);

        System.out.println("-----------------------------");
        Test test = new Test();
        test.bubble(person);

        // 遍历数组  调用test() 方法
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
            test.test(person[i]);   // 遍历多态数组
        }


    }

    public void test(Person p){
        if (p instanceof Student){
            ((Student) p).study();
        }else if (p instanceof Teacher){
            ((Teacher) p).teach();
        }else {
            System.out.println("输入类型有误！");
        }
    }

    public void bubble(Person[] person){
        Person temp = null;
        for (int i = 0; i < person.length-1; i++) {
            for (int j = 0; j < person.length-1-i; j++) {
                if (person[j].getAge() > person[j+1].getAge()){
                    temp = person[j];
                    person[j] = person[j+1];
                    person[j+1] = temp;
                }
            }
        }
    }
}
