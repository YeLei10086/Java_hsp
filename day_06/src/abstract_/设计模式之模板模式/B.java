package abstract_.设计模式之模板模式;

public class B extends 模板模式{

    @Override
    public void job() {
        int sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum += i;
        }
    }
}
