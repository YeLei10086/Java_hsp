package exception_;

/**
 * @author 叶磊
 */

//当试图将对象转换为不是实例的子类时，抛出该异常
//类型转换异常    ClassCastException
public class ClassCastException_ {
    public static void main(String[] args) {
        Person person = new A();    //向上转型
        A a = (A)person;    //向下转型
        B b = (B)person;    //这里报错,一开始运行类型是A，强转B报错
    }
}

class Person{}
class A extends Person{}
class B extends Person{}
