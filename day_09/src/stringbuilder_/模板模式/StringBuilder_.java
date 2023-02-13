package stringbuilder_.模板模式;

/**
 * @author 叶磊
 */
public class StringBuilder_ extends Time{

    @Override
    void job() {
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < 100000; i++) {   //拼接80000次
            builder.append(String.valueOf(i));
        }
    }
}
