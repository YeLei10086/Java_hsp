package homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author 叶磊
 */
public class HomeWork03_3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "D:\\迅雷下载\\dog.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        Object object = ois.readObject();
        System.out.println(object);

        //获取单一的属性
        Dog  dog = (Dog) object;
        System.out.println(dog.getName());

        ois.close();
        System.out.println("反序列化完成");
    }
}
