public class 练习题3 {

    public static void main(String[] args) {
        int[] arr = {1,66,33,72,5};
        int temp = 0;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + "\t");
            }
            System.out.println();
        }
    }
}
