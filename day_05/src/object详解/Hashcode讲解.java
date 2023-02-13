package object详解;

public class Hashcode讲解 {
    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new A();
        // 不同的对象，哈希值不是一样的
        System.out.println("a1 hashcode = " + a1.hashCode());
        System.out.println("a2 hashcode = " + a2.hashCode());

        A a3 = a1;
        // 同一个对象，哈希值肯定是一样的
        System.out.println("a3 hashcode = " + a1.hashCode());
        System.out.println("a4 hashcode = " + a3.hashCode());
    }
}

class A{}
