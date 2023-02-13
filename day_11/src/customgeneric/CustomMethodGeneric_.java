package customgeneric;

import java.util.ArrayList;

/**
 * @author 叶磊
 */
public class CustomMethodGeneric_ {
    public static void main(String[] args) {
        //基本语法：
        //  修饰符<T,R...> 返回类型 方法名(参数列表){}

        //注意细节：
        //1、泛型方法，可以定义在普通类中,也可以定义在泛型类中
        //2、当泛型方法被调用时,类型会确定
        //3、public void eat(E e){},修饰符后没有<T,R...> eat
        //      说明不是泛型方法,而是使用了泛型

        Car car = new Car();
        car.fly("宝马",100);  //当调用方法时,传入参数,编译器才会确定类型
        car.fly(10086,1000.0);  //当调用方法时,传入参数,编译器才会确定类型

        fish<String, ArrayList> fish = new fish<>();
        fish.hi(new ArrayList(),10.8);
    }
}

//普通类
class Car{
    //普通方法
    public void run(){

    }

    //说明  泛型方法
    //1、<T,R> 就是泛型
    //2、是提供给 fly使用的
    public <T,R> void  fly(T t,R r){    //泛型方法
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}

//泛型类
class fish<U,K>{    //类声明的泛型
    public <T,D> void eat(T t,D d){}    //泛型方法

    //说明：
    //1、下面的run方法 不是泛型方法
    //2、而是run方法使用了类声明的 泛型
    public void run(U u){

    }

    //泛型方法,可以使用类声明的泛型,也可以使用自己声明的泛型
    public <A> void hi(K k,A a){
        System.out.println(k.getClass());
        System.out.println(a.getClass());
    }
}