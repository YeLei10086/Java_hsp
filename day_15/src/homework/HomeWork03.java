package homework;

import java.io.*;
import java.util.Properties;

/**
 * @author 叶磊
 */
public class HomeWork03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //1. 创建Properties 对象
        Properties properties = new Properties();
        //2. 加载指定配置文件
        properties.load(new FileReader("day_15\\src\\dog.properties"));
        //3. 把k-v显示控制台
//        properties.list(System.out);
        //4. 根据key 获取对应的值
        String name = properties.getProperty("name");
        int age = Integer.parseInt(properties.getProperty("age"));
        String color = properties.getProperty("color");

        Dog dog = new Dog(name, age, color);
        System.out.println("读取 properties 文件 并输出狗的信息成功");
        System.out.println(dog);
        System.out.println("序列化输出 dog 信息");
        m1();
        System.out.println("反序列化输出 dog 信息");
        m2();
    }

    //序列化
    public static void m1() throws IOException {
        String filePath = "D:\\迅雷下载\\dog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeObject(new Dog("大黄",5,"yellow"));
        oos.close();
        System.out.println("序列化输出 "+ filePath + " 结束！");
    }

    //反序列化
    public static void m2() throws IOException, ClassNotFoundException {
        String filePath = "D:\\迅雷下载\\dog.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        Object object = ois.readObject();
        System.out.println(object);

        //获取单一的属性
        Dog  dog = (Dog) object;
        System.out.println(dog.getName());

        ois.close();
        System.out.println("反序列化" +  filePath + " 完成");
    }
}