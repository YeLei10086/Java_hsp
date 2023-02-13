package interface_.接口多态数组;

public class Phone implements Usbs{
    @Override
    public void work() {
        System.out.println("手机开始工作了...");
    }

    public void call(){
        System.out.println("手机开始拨号了...");
    }
}
