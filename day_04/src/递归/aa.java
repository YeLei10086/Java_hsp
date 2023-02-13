package 递归;

public class aa {

    public static int fac2(int n) {
        if (n == 1) {
            return 1;
        }
        int temp = 0;
        temp = n * fac2(n - 1);
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(fac2(2));
    }
}
