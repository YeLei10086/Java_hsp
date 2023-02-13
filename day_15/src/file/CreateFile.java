package file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 叶磊
 * 演示创建文件
 */
public class CreateFile {
    public static void main(String[] args) {

    }

    //第一种方式  new File(String pathname)
    @Test
    public void create01(){
        String filePath = "D:\\迅雷下载\\newfile.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //第二种方式 new file(File parent, String child) //父目录 + 子路径
    @Test
    public void create02(){
        File parentPath = new File("D:\\");
        String childPath = "迅雷下载\\newfile02.txt";
        File file = new File(parentPath,childPath);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //第三种方式 new File(String parent, String child)
    @Test
    public void create03(){
        String parentPath = "D:\\";
        String childPath = "迅雷下载\\newfile03.txt";
        File file = new File(parentPath,childPath);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}