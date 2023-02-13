package stringbuilder_.模板模式;

/**
 * @author 叶磊
 */
public class String_ extends Time{

    @Override
    void job() {
        String text = "";
        for (int i = 0; i < 80000; i++) {   //拼接80000次
            text += i;
        }
    }
}
