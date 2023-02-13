package 多态.多态数组;

public class Test {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        //动态绑定对应的对象
        person[0] = new Person("人",100);
        person[1] = new Student("Tom",20,100);
        person[2] = new Teacher("Smith",35,20000);

        //循环遍历多态数组,调用say()
        for (int i = 0; i < person.length; i++) {
            //person[i] 编译类型是Person , 运行类型是根据实际情况 由JVM机来判断
            System.out.println(person[i].say()); //动态绑定机制
            //如何解决子类中有特定的方法,但要通过多态数组读出
            if (person[i] instanceof Student){  //判断person[i] 的运行类型是不是 Student类
                ((Student)person[i]).study(); // 向下转型
            }else if (person[i] instanceof Teacher){
                ((Teacher)person[i]).teach();
            }else if (person[i] instanceof Person){

            }else {
                System.out.println("你的类型有误,请检查...");
            }
        }
    }
}
