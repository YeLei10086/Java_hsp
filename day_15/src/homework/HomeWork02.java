package homework;

import java.io.*;

/**
 * @author 叶磊
 */
public class HomeWork02 {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\迅雷下载\\testReader3.txt";  //gbk编码文件
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"gbk"));
        String line = "";
        int num = 0;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println("第" + ++num + "行 " + line);
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
    }
}
