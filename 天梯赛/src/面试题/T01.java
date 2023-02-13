package 面试题;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 叶磊
 */
public class T01 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
       List<Integer> list = new ArrayList<>();
       list.add(2);
       Class<? extends List> clazz = list.getClass();
       Method add = clazz.getDeclaredMethod("add", Object.class);  //类型擦除
        add.invoke(list,"ky");
        System.out.println(list);
    }

}
