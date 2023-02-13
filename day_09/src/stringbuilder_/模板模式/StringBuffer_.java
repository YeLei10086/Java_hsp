package stringbuilder_.模板模式;

/**
 * @author 叶磊
 */
public class StringBuffer_ extends Time{

    @Override
    void job() {
        StringBuffer buffer = new StringBuffer("");
        for (int i = 0; i < 100000; i++) {   //拼接80000次
            buffer.append(String.valueOf(i));
        }
    }
}
