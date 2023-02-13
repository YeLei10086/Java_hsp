package 小练习.homeWork2;

/**
 * @author 叶磊
 */
public class CellPhone {

    // 当我们调用testWork方法时，直接传入一个实现了IComputer接口的匿名内部类即可
    // 该匿名内部类可以灵活的实现work，完成不同的计算任务
    public void testWork(IComputer iComputer,double n1,double n2){
        double result = iComputer.work(n1, n2);
        System.out.println("计算后的结果 = " + result);
    }
}
