/**
 * @Author YeLei
 * @Date 2021/11/14 19:47
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,5};
        int targer = 4;
        int index = -1;

        int left = nums[0];
        int right = nums.length-1;

        while (left < right){
            int middleIndex = (left + right) / 2;
            int middleNum = nums[middleIndex];
            if (middleNum == targer){
                index = middleIndex;
                break;
            }else if (middleNum < targer){
                left = middleIndex + 1;
            }else {
                right = middleIndex - 1;
            }
        }

        if (index == -1){
            System.out.println(index);
        }else {
            System.out.println(index);
        }
    }
}
