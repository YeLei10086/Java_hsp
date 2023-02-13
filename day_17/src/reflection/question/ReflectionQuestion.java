package reflection.question;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author 叶磊
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("day_17\\src\\reflection\\cat.properties"));

        String classpath = properties.getProperty("classpath").toString();
        String method = properties.get("method").toString();
        System.out.println(classpath);
        System.out.println(method);

        //利用反射机制解决
        //1、加载类，返回class类型的对象
        Class aClass = Class.forName(classpath);
        //2、通过 class类型的对象 得到你加载的类 reflection.question.Cat 的对象实例
        Object object = aClass.newInstance();
        //3、通过 class类型的对象 得到你加载的类 reflection.question.Cat 的 method"hi" 的方法对象
        Method method1 = aClass.getMethod(method);
        //4、通过 method1 调用方法：即通过方法调用对象
        method1.invoke(object);

        //获取类中的成员变量
        Field nameField = aClass.getField("name");
        System.out.println(nameField);

        //获取类的构造方法(无参)
        Constructor constructor = aClass.getConstructor();
        System.out.println(constructor);
        //获取类的构造方法(有参)
        constructor = aClass.getConstructor(String.class);
        System.out.println(constructor);

    }
}

