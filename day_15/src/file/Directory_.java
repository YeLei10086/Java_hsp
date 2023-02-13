package file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 叶磊
 */
public class Directory_ {
    public static void main(String[] args) {

    }

    @Test
    public void m1() {
        String filePath = "D:\\迅雷下载\\newfile.txt";
        File file = new File(filePath);
        if (file.isFile()) {
            System.out.println("是一个文件");
        } else {
            System.out.println("该文件不存在！");
        }
    }

    @Test
    public void m2() {
        String filePath = "D:\\迅雷下载\\Testdirectory";
        File file = new File(filePath);
        if (file.isDirectory()) {
            if (file.exists()) {
                file.delete();
                if (file.delete()) {
                    System.out.println("是一个文件夹,删除成功！");
                } else {
                    System.out.println("删除失败！");
                }
            }
        } else {
            System.out.println("该文件夹不存在！");
        }
    }

    @Test
    public void m3() {
        String filePath = "D:\\迅雷下载\\新建文件夹\\a\\b\\c";
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("该目录已存在！");
            if (file.delete()) {
                System.out.println("删除成功！");
            }
        } else {
            if (file.mkdirs()){  //创建多级目录
            System.out.println("创建目录成功！");
            }else {
                System.out.println("创建目录失败！");
            }
        }
    }
}


