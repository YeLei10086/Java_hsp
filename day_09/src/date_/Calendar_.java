package date_;

import java.util.Calendar;

/**
 * @author 叶磊
 */
public class Calendar_ {
    public static void main(String[] args) {
        // 1.Calendar 是一个抽象类,并且构造器是私有化的
        // 2.可以通过 getInstance() 来获取实例
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println("年：" + calendar.get(Calendar.YEAR) );
        //月份从0开始的
        System.out.println("月：" + (calendar.get(Calendar.MONTH ) + 1));
        System.out.println("日：" + calendar.get(Calendar.DAY_OF_MONTH) );
        System.out.println("时：" + calendar.get(Calendar.HOUR) );
        System.out.println("分：" + calendar.get(Calendar.MINUTE) );
        System.out.println("秒：" + calendar.get(Calendar.SECOND) );
        // 3.Calendar 没有专门的格式化方法，需要程序员进行自行组合显示
        // 4.如果我们需要按照 24小时进制来获取时间
        System.out.println("小时：" + calendar.get(Calendar.HOUR_OF_DAY));
    }
}
