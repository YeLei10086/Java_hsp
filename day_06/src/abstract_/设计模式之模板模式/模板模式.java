package abstract_.设计模式之模板模式;

abstract class 模板模式 {

    public void currentTime(){
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("总共耗时：" + (end - start) + "毫秒" );
    }

    public abstract void job();
}
