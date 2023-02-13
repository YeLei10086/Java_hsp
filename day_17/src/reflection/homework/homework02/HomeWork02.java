package reflection.homework.homework02;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 叶磊
 */
public class HomeWork02 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, IOException {
        Class fileCls = Class.forName("java.io.File");
        Constructor[] declaredConstructors = fileCls.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println("File的所有构造器 ： " + declaredConstructor);
        }

        String filePath = "d:\\迅雷下载\\ak.txt";
        Constructor declaredConstructor = fileCls.getDeclaredConstructor(String.class);
        File file = (File) declaredConstructor.newInstance(filePath);
        System.out.println(file.getClass());

        //得到 createNewFile 的方法对象
        Method createNewFile = fileCls.getMethod("createNewFile");
        createNewFile.invoke(file);
        System.out.println("创建成功！" + filePath);

    }
}
