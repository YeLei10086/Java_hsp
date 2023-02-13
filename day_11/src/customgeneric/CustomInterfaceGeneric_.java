package customgeneric;

/**
 * @author 叶磊
 */
public class CustomInterfaceGeneric_ {
    public static void main(String[] args) {
        //基本语法:
        //  interface 接口名<T,R...>{}

        //注意细节：
        //1、接口中,静态成员也不能使用泛型(这个和泛型类规定一样)
        //2、泛型接口的类型,在 继承接口 或者 实现接口 时确定
        //3、没有指定类型的情况下,默认是Object
    }
}

interface Iusb<U,R>{
    //普通方法中使用泛型接口
    R get(U u);
//    R name; 静态属性、方法中不能使用类的泛型
    void hi(R r);
    void run(R r1,R r2,U u1,U u2);

    //在JDK8 中,可以在接口中,使用默认方法
    default R method(U u){
        return null;
    }
}
//泛型接口的类型,在 继承接口 或者 实现接口 时确定
interface IA extends Iusb<String,Integer>{

}

//接口指定了 泛型的类型，因此这里会默认使用接口定义的泛型类型
class A implements IA{
    @Override
    public Integer get(String s) {
        return null;
    }

    @Override
    public void hi(Integer integer) {

    }

    @Override
    public void run(Integer r1, Integer r2, String u1, String u2) {

    }
}

//不指定泛型  默认是Object
class B implements Iusb<Object,Object>{

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}

//泛型接口的类型,在 继承接口 或者 实现接口 时确定
class C implements Iusb<Double,String>{

    @Override
    public String get(Double aDouble) {
        return null;
    }

    @Override
    public void hi(String s) {

    }

    @Override
    public void run(String r1, String r2, Double u1, Double u2) {

    }
}