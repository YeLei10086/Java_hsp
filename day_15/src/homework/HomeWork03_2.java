package homework;

import java.io.*;

/**
 * @author 叶磊
 */
public class HomeWork03_2 {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\迅雷下载\\dog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeObject(new Dog("大黄",5,"yellow"));
        oos.close();
        System.out.println("序列化结束！");
    }
}
