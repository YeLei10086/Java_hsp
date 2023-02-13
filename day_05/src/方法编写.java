public class 方法编写 {
    public static void main(String[] args) {

        方法编写 a = new 方法编写();
        int[] arr = {5,9,7,10,8};
        a.bubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public void bubble(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length -1-i; j++) {
                if (arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
