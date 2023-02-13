package homework.homework03;

import java.util.*;

/**
 * @author 叶磊
 */
public class Main {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("jack",650);
        hashMap.put("tom",1200);
        hashMap.put("smith",2900);
        //修改jack工资数据
        hashMap.put("jack",2600);
        //给所有员工添加工资100
        Set keySet = hashMap.keySet();
        for (Object key : keySet) {
            hashMap.put(key,(Integer)hashMap.get(key) + 100);
        }
        System.out.println(hashMap);

        //遍历员工和工资
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        //遍历所有工资
        Collection values = hashMap.values();
        for (Object value : values) {
            System.out.println(value);
        }


    }
}
