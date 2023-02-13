public class for循环控制 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for(int i = 1;i<=100;i++){
            if (i%9 == 0){
                sum++;
                count+=i;
            }
        }
        System.out.println("总个数为："+sum+",总和为"+count);
    }
}

