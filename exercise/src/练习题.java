public class 练习题 {
    /**
     * 输出1-100之间的不能被5整除的数，每5个一行
     * @param args
     */
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 5 != 0){
                System.out.print(i + "\t");
                count++;
                if (count % 5 == 0){
                    System.out.println();
                }
            }

        }
    }
}
