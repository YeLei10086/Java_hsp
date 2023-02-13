package map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 叶磊
 */
public class MapMethod {
    public static void main(String[] args) {
        //演示map接口的常用方法
        Map map = new HashMap();
        map.put("张三","12");
        map.put("张三","22");
        map.put("李四","17");
        map.put("王五","30");
        map.put("赵六","25");
        System.out.println(map);

        //remove:根据键删除映射关系
        map.remove("王五");
        System.out.println(map);

        //get:根据键获取值
        Object object = map.get("张三");
        System.out.println(object);

        //size:获取元素个数
        System.out.println(map.size());

        //isEmpty:判断个数是否为0
        boolean empty = map.isEmpty();
        System.out.println(empty);

        //containsKey:查找键是否存在
        boolean key = map.containsKey("赵六");
        System.out.println(key);

        //clear:清除
        map.clear();
        System.out.println(map);
    }
}
