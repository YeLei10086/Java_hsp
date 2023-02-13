package outputstream_;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author 叶磊
 *
 * 对象流
 */
public class ObjectOutputStearm_ {
    public static void main(String[] args) throws Exception {
        //序列化后,保存文件的格式,不是存文本,而是按照它的格式来保存
        String filepath = "D:\\迅雷下载\\oos.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filepath));
        //序列化数据到 D:\迅雷下载\oos.dat
        oos.writeInt(100); //int -> Integer
        oos.writeBoolean(true); //boolean -> Boolean
        oos.writeDouble(1.0);   //double -> Double
        oos.writeFloat(2.0f);   //float -> Float
        oos.writeChar('h');   //char -> Character
        oos.writeUTF("hcy");    //String
        //保存一个dog对象
        oos.writeObject(new Dog("hcy",3));

        oos.close();
        System.out.println("数据保存成功！(序列化形式)");
    }
}
