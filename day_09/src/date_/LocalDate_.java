package date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author 叶磊
 */
public class LocalDate_ {
    public static void main(String[] args) {
        //第三代日期
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println("年"+ldt.getYear());
        System.out.println("月"+ldt.getMonth());
        System.out.println("月"+ldt.getMonthValue());
        System.out.println("日"+ldt.getDayOfMonth());
        System.out.println("时"+ldt.getHour());
        System.out.println("分"+ldt.getMinute());
        System.out.println("秒"+ldt.getSecond());

        LocalDate now = LocalDate.now();    //获取年月日
        System.out.println(now);
        LocalTime now2 = LocalTime.now();   //获取时分秒
        System.out.println(now2);
    }
}
