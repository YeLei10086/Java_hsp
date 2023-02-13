package reflection.homework.homework01;

import javax.naming.Name;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 叶磊
 */
public class HomeWork01 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class aClass = Class.forName("reflection.homework.homework01.PrivateTest");
        Object o = aClass.newInstance();
        Field field = aClass.getDeclaredField("name");
        field.setAccessible(true);
        field.set(o,"猪头");
        Method getName = aClass.getMethod("getName");
        System.out.println(getName.invoke(o));
    }
}
