package map_;

import java.util.Properties;

/**
 * @author 叶磊
 */
public class Properties_ {
    public static void main(String[] args) {
        //1、Properties类继承自Hashtable类并且实现了Map接口,也是使用一种键值对的形式来保存数据
        //2、它的使用特点与Hashtable类似
        //3、Properties 还用于 从 xxx.properties 文件中, 加载数据到Properties类对象,并进行读取和修改
        //4、说明： 工作后 xxx.properties文件通常为配置文件,这个知识点在IO流举例

        Properties properties = new Properties();
        //properties.put(null,"老虎");   //异常 NullPointerException
        //properties.put(4,null);  //异常 NullPointerException
        properties.put(1,"猪头");
        properties.put(2,"狗头");
        properties.put(3,"牛头");
        properties.put(4,"马头");

        System.out.println(properties);

        //通过key 获取 value
        System.out.println(properties.get(2));

        //删除
        properties.remove(4);
        System.out.println(properties);

        //修改
        properties.put(1,"小猪头");
        System.out.println(properties);
    }
}
