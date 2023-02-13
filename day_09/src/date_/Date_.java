package date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 叶磊
 */
public class Date_ {
    public static void main(String[] args) throws ParseException {

        Date date = new Date();     // 获取当前系统时间
        System.out.println("当前日期 = " + date.getTime());     //获取某个时间对应的毫秒数

        Date date2 = new Date(19980321);    //通过指定毫秒数得到时间
        System.out.println(date2);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(date);  //format:将日期转换成指定格式的字符串
        System.out.println("当前日期 = "  + format);

        // 1.可以把一个格式化的 String 转成对应的 Date
        String str = "1998年03月21日 03:00:00 星期六";
        Date parse = sdf.parse(str);
        // 2.得到Date 在输出时，还是按照国外的形式输出
        System.out.println(parse);
        // 如果希望指定格式输出，需要format转换
        System.out.println(sdf.format(parse));
    }
}
