/**
 * @Author YeLei
 * @Date 2022/10/19 19:44
 * @Version 1.0
 */
public class 素数 {
    public static void main(String[] args) {

        for (int i = 2; i <= 100 ; i++) {
            boolean isFlag = true;  //标识符
            for (int j = 2; j <= Math.sqrt(i); j++) { //j被i除
                if (i % j == 0){
                    isFlag = false; //标识i是否被j除尽
                    break;
                }
            }
            if (isFlag == true) {
                System.out.println(i);
            }
        }
    }
}
