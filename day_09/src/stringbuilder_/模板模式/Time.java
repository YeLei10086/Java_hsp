package stringbuilder_.模板模式;

/**
 * @author 叶磊
 */
abstract class Time {

    public void currentTime() {
        long startTime = System.currentTimeMillis();
        job();
        long endTime = System.currentTimeMillis();
        System.out.println("执行时间：" + (endTime - startTime));
    }

    abstract void job();
}
