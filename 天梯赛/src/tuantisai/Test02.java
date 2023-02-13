package tuantisai;

/**
 * @author 叶磊
 */
import java.io.*;
public class Test02 {
    public static boolean flag = false;
    public static int[] nums = new int[5];
    public static boolean mark[] = new boolean[5];
    public static void dfs(int sum,int num){
        if(num==3){
            if(sum%10==0){
                flag = true;
            }
            return;
        }
        for(int i=0;i<5;i++){
            if(mark[i]==false){
                mark[i]=true;
                dfs(sum+nums[i],num+1);
                mark[i]=false;
            }

        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine()); //逐行读取值，强转为int类型
        for(int i = 0; i < n; i++){
            String[] data = br.readLine().split(" ");   //string[] 数组，逐行读取，用空格分割

            int sum = 0;    //定义一个累加器
            for(int j = 0; j < 5; j++){
                nums[j] = Integer.valueOf(data[j]); //逐行读取值，用nums接收数组
                sum += nums[j]; //
            }
            flag = false;
            dfs(0,0);
            if(flag){
                System.out.println(sum%10==0? 10 : sum%10);
            }else{
                System.out.println(0);
            }
        }
    }
}
