/**
 * @author 叶磊
 */

//测试当前CPU有多少个
public class TestCpu {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int cpuNum = runtime.availableProcessors();
        System.out.println("当前电脑有CPU = " + cpuNum);
    }
}
