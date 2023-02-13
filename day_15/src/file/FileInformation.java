package file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author 叶磊
 */
public class FileInformation {
    public static void main(String[] args) {

    }

    //获取文件对象信息
    @Test
    public void info(){
        //先创建文件对象
        File file = new File("D:\\迅雷下载\\newfile.txt");
        //调用相应的方法,得到对应的信息
        System.out.println("获取文件名: " + file.getName());
        System.out.println("获取文件绝对路径: " + file.getAbsolutePath());
        System.out.println("获取文件路径: " + file.getPath());
        System.out.println("获取文件父级路径: " + file.getParent());
        System.out.println("获取文件大小（按字节统计）: " + file.length());
        System.out.println("是否是文件: " + file.isFile());
        System.out.println("文件是否存在: " + file.exists());
        System.out.println("是否是文件夹: " + file.isDirectory());
    }
}
