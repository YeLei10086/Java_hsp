package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 叶磊
 */
public class GenericDetail {
    public static void main(String[] args) {
        //1、interface List<T>{},
        //    public class HashSet<E>{}...等等,
        //    说明T,E只能是引用类型

        //2、在指定泛型具体类型后,可以传入该类型或者其子类类型
        C<A> ac = new C<>(new A());
        ac.f1();
        C<A> bc = new C<>(new B());
        bc.f1();

        //3、泛型的使用形式
        List<Integer> list = new ArrayList<Integer>();
        //在实际开发中,我们往往简写（推荐使用）
        List<Integer> list2 = new ArrayList<>();

        //4、如果我们这样写     等价于     List<Object> list3 = new ArrayList<>();
        List list3 = new ArrayList();   //默认给它的 泛型是[<E> E就是 Object]
    }
}

class A{}

class B extends A{}

class C<E>{
    E e;

    public C(E e) {
        this.e = e;
    }

    public void f1(){
        System.out.println(e.getClass());
    }

}
