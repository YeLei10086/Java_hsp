package map_;

import java.util.HashMap;

/**
 * @author 叶磊
 */
public class Map_ {
    public static void main(String[] args) {

        //JDK8 中 Map接口的特点：
        //1、Map与Collection并列存在，用于保存具有映射关系的数据：Key-Value
        //2、Map中的Key 和 Value 可以是任何引用类型的数据,会封装到 HashMap$Node 对象中
        //3、Map 中的 Key 不允许重复,原因和HashSet一样,看源码
        //4、Map 中的 Value 可以重复
        //5、Map 的 Key 可以为 null, Value 也可以为null，
        //     注意key 为 null时,只能有一个,但 value 为 null时,可以有多个
        //6、常用String类 作为 Map的Key
        //7、key 和 value 之间存在单向一对一关系,即通过指定的 Key 总能找到对应的 Value
        HashMap hashMap = new HashMap();
        hashMap.put("No1","猪头");
        hashMap.put("No2","狗头");
        hashMap.put("No1","猪头");    //遇到Key值相同的元素,进行的是替换操作
        hashMap.put("No3","狗头");    //Map 中的 Value 可以重复
        hashMap.put(new Object(),"还能这样添加！"); //常用String类 作为 Map的Key，也可以是别的类型，只是String使用更频繁
        System.out.println(hashMap);    //无序输出

    }
}
