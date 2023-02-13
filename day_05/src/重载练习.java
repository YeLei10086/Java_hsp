public class 重载练习 {

    public static void main(String[] args) {
        重载练习 a = new 重载练习();
        int aa = a.getInt(2, 5);
        System.out.println(aa);

        double bb = a.getDouble(7, 5, 9);
        System.out.println(bb);

        double[] arr = {1, 9, 7, 4, 6};
        System.out.println("最大元素下标为：" + a.getDoubleIndex(arr));

        String[] arr2 = {"tom", "jack", "smith"};
        System.out.println("最大元素下标为：" + a.getStringLenth(arr2));

        int[] arr3 = {9, 5, 2, 7, 11};
        a.getSort(arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }

        System.out.println();

        String[] arr4 = {"tom", "jack", "smith", "hh"};
        a.getStringSort(arr4);
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + "\t");
        }
    }

    //两个int的最大值
    public int getInt(int a, int b) {
        return a > b ? a : b;
    }

    //三个double的最大值
    public double getDouble(int a, int b, int c) {
        double max = 0;
        max = a > b ? a : b;
        return max > c ? max : c;
    }

    //使用方法重载实现返回double数组中最大值的下标
    public double getDoubleIndex(double[] arr) {
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[indexMax] < arr[i]) {
                indexMax = i;
            }
        }
        return indexMax;
    }

    //使用方法重载实现返回string数组的长度最大的元素下标
    public int getStringLenth(String[] arr) {
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[indexMax].length() < arr[i].length()) {
                indexMax = i;
            }
        }
        return indexMax;
    }

    //使用方法重载实现使用冒泡排序完成 对 int[] 从小到大排序
    public void getSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //使用方法重载实现使用冒泡排序完成 对 int[] 从小到大排序
    public void getStringSort(String[] arr) {
        String temp = " ";
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].length() < arr[j + 1].length()) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
