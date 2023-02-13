package inputstream_;

import outputstream_.Dog;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author 叶磊
 */
public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception {
        //需要进行反序列化的路径
        String filepath = "D:\\迅雷下载\\oos.dat";

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filepath));
        //这里反序列化顺序，必须和序列化顺序，保持一致，否则报错！！！
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readDouble());
        System.out.println(ois.readFloat());
        System.out.println(ois.readChar());
        System.out.println(ois.readUTF());
        Object dog = ois.readObject();
        System.out.println("运行类型 = " + dog.getClass());
        System.out.println(dog);

        //重要的细节！！！
        //如果我们希望只获取 dog 的名字 或者 只获取 dog的年龄
        //1、首先我们需要把上面 Object dog 向下转型 成 Dog类
        //2、需要把你定义的Dog类,引用到当前类中,否则我们不能调用Dog类的方法,因为没有这个类
        Dog dog2 = (Dog) dog;
        System.out.println(dog2.getName());

        ois.close();
        System.out.println("数据输出成功!(反序列化形式)");
    }
}
