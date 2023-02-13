package homework;

import java.io.*;

/**
 * @author 叶磊
 */
public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        String directoryPath = "D:\\迅雷下载\\mytemp";
        File file = new File(directoryPath);
        if (!(file.exists())){
            System.out.println("文件不存在！");
            if (file.mkdir()){
                System.out.println("创建 " + directoryPath + " 成功");
            }else {
                System.out.println("创建 " + directoryPath + " 失败");
            }
        }

        String filePath = directoryPath + "\\hello.txt";
        File file1 = new File(filePath);
        if (!(file1.exists())){
            if (file1.createNewFile()){
                System.out.println("创建" + filePath + "成功");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
                bufferedWriter.write("开心就好！");
                System.out.println("文件写入成功！");
                bufferedWriter.close();
            }else {
                System.out.println("创建" + filePath + "失败");
            }
        }else {
            System.out.println("文件已存在");
        }
    }
}
