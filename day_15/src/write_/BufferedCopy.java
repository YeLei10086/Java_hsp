package write_;

import java.io.*;

/**
 * @author 叶磊
 */
public class BufferedCopy {
    /**
     * 说明：
     *  1、BufferedReader 和 BufferedWriter 是按照字符操作
     *  2、不要去操作 二进制文件【声音，视频，文档等】 ,否则可能会造成文件损坏
     * @param args
     */
    public static void main(String[] args) {
        //需要拷贝的文件路径
        String srcPath = "D:\\迅雷下载\\testReader.txt";
        //拷贝到什么位置的文件路径
        String destPath = "D:\\迅雷下载\\testReader2.txt";
        //创建 BufferedReader 对象
        BufferedReader bufferedReader = null;
        //创建 BufferedWriter 对象
        BufferedWriter bufferedWriter = null;
        String line;    //读取一行
        try {
            //将复制的文件路径加入
            bufferedReader = new BufferedReader(new FileReader(srcPath));
            //将文件路径加入
            bufferedWriter = new BufferedWriter(new FileWriter(destPath));
            //循环读取内容,直到内容为 null
            while ((line = bufferedReader.readLine()) != null){
                //写入文件
                bufferedWriter.write(line);
                //每写一行换行
                bufferedWriter.newLine();
            }
            System.out.println("拷贝成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bufferedReader != null){
                    bufferedReader.close();
                }
                if (bufferedWriter != null){
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
