package tuantisai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        String[] split = str.split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        int[][] arr = new int[m][3];

        for(int i = 0;i<m;i++){
            str = bf.readLine();
            split = str.split(" ");
            for(int j = 0;j<3;j++){
                arr[i][j] = Integer.parseInt(split[j]);
            }
        }
        int ans =0;
        for(int i=0;i<m;i++) {
            if(arr[i][2]==1) {
                if(ans<arr[i][0]) {
                    ans=arr[i][0];
                }
            }
            if(arr[i][2]==2) {
                if(ans<n+1-arr[i][1]) {
                    ans=n+1-arr[i][1];
                }
            }
            if(arr[i][2]==3) {
                if(ans<n+1-arr[i][0]) {
                    ans=n+1-arr[i][0];
                }
            }
            if(arr[i][2]==4) {
                if(ans<arr[i][1]) {
                    ans=arr[i][1];
                }
            }
        }
        System.out.println(ans);
    }

}