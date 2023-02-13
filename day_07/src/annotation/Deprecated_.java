package annotation;

/**
 * @author 叶磊
 */
@SuppressWarnings("all")
public class Deprecated_ {
    public static void main(String[] args) {
        AA aa = new AA();
        System.out.println(aa.N);
        aa.run();
    }
}

// 1、@Deprecated 修饰某个元素，表示该元素已过时
// 2、但过时不代表不能使用，只是不推荐使用
@Deprecated
class AA{
    @Deprecated
    public int N = 10;
    @Deprecated
    public void run(){};
}