package customgeneric;

/**
 * @author 叶磊
 */
public class CustomGeneric_ {
    public static void main(String[] args) {
        //基本语法:
        //  class 类名<T,R...>{}  //表示可以有多个泛型
        Tiger<Double, String, Integer> tiger = new Tiger<>("测试");
        tiger.setT(10.25);
//        tiger.setT("yy"); 报错.类型不匹配
        System.out.println(tiger);

        Tiger tiger2 = new Tiger("测试2");    //不指定泛型类型,说明都是Object类型的
        tiger2.setT("qaq");
        System.out.println(tiger2);
    }
}

//解读：
//1、Tiger 后面是泛型,所以我们把 Tiger 就称为 自定义泛型类
//2、T,R,M 泛型标识符,一般是单个大写字母
//3、泛型标识符可以有多个
//4、普通成员可以使用泛型(属性、方法)
//5、使用泛型的数组,不能初始化
//6、静态属性、方法中不能使用类的泛型
class Tiger<T,R,M>{
    String name;
    R r;    //属性使用到泛型
    M m;
    T t;
    //因为数组在new 不确定 T 的使用类型，就无法在内存开辟空间
//    T[] ts = new int[8];


    public Tiger(String name) {
        this.name = name;
    }

    //构造器使用到泛型
    public Tiger(String name, R r, M m, T t) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //方法使用到泛型
    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    //因为静态是和类相关的,在类加载时,对象还没有被创建，
    //所以,如果静态方法和静态属性使用了泛型,JVM就无法完成初始化
//    static R r2;
//    public static void f1(M m){
//    }


    @Override
    public String toString() {
        return "\nTiger{" +
                "name='" + name + '\'' +
                ", r=" + r +
                ", m=" + m +
                ", t=" + t +
                '}';
    }
}
