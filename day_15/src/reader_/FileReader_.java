package reader_;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author 叶磊
 */
public class FileReader_ {
    public static void main(String[] args) {

    }

    @Test
    public void fileReader01(){
        String filePath = "D:\\迅雷下载\\testReader.txt";
        //创建一个 FileReader 对象
        FileReader fileReader = null;
        try {
            //将读取的文件路径加入流
            fileReader = new FileReader(filePath);
            //一个一个字符读
            int readLen = 0;
            //循环读取字符,直到 -1结束
            while ((readLen = fileReader.read()) != -1){
                System.out.print((char) readLen);
            }
            System.out.println("读取完成！");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //释放资源,关闭流
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void fileReader02(){
        String filePath = "D:\\迅雷下载\\testReader.txt";
        //创建一个 FileReader 对象
        FileReader fileReader = null;
        try {
            //将读取的文件路径加入流
            fileReader = new FileReader(filePath);
            //读取字符串,用数组方式,加快读取方式
            char[] buf = new char[64];
            int readLen = 0;
            //循环读取字符,返回的是实际读取到的字符数
            // 如果返回-1,说明读取文件结束
            while ((readLen = fileReader.read(buf)) != -1){
                System.out.print(new String(buf,0,buf.length)); //推荐使用这种方式
            }
            System.out.println("读取完成！");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //释放资源,关闭流
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
