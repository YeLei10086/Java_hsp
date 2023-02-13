package homework.homework01;

import java.util.ArrayList;

/**
 * @author 叶磊
 */
public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new News_("新闻一:北京八达岭野生动物园又有人擅自下车 停业一天整改 游客：动物圈起来的多了“没感觉”了"));
        list.add(new News_("新闻二:数字货币今年涨幅谁最高？比特币竟然倒数"));

        int size = list.size();
        // 倒序输出
        for (int i = size - 1; i >= 0 ; i--) {
            //强转
            News_ object = (News_) list.get(i);
            //输出标题格式
            System.out.println(processTitle(object.getTitle()));
        }
    }

    //获取标题长度
    public static String processTitle(String title){
        if (title == null) {
            return "异常";
        }

        if (title.length() > 15){
            return  title.substring(0, 15) + "...";
        }else {
            return  title;
        }
    }
}
