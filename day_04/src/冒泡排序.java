public class 冒泡排序 {

    public static void main(String[] args) {

        int[] arr = {1,55,24,68,33};
        int temp = 0;

        for (int i = 0; i < arr.length-1 ; i++) {    //循环次数
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.print("\n第"+(i+1)+"轮结果:");
            for (int k = 0; k <arr.length ; k++) {
                System.out.print(arr[k]+"\t");

            }
        }

    }
}
