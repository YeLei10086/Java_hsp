package reader_;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author 叶磊
 */
public class BufferedReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "D:\\迅雷下载\\hello.txt";
        BufferedReader bufferedReader = null;
        //创建一个BufferedReader对象
        bufferedReader = new BufferedReader(new FileReader(filePath));
        String line = null; //按行读取,效率高
        //当返回null时,表示文件读取完毕
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        System.out.println("读取成功！");
        bufferedReader.close();
    }
}
