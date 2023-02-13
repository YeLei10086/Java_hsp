public class 多参练习 {

    public static void main(String[] args) {
        多参练习 a = new 多参练习();
        Result res = a.getInfo(15,12,17,22);
        System.out.println("最大值 = " + res.max+ " 最小值 = "+ res.min + " 和 = " + res.sum);
    }

    //编写方法，可以接收多个不等的double值，返回他们的和，最大值，最小值
    public Result getInfo(double... nums){
        Result result = new Result();
        if (nums.length == 0){    //null的判断
            result.max = Double.NaN;
            result.min = Double.NaN;
            result.sum = Double.NaN;
            return result;
        }

        result.max = nums[0];   //假设第一个元素是最大值
        result.min = nums[0];
        result.sum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (result.max < nums[i]){      //如果最大值小于当前值，替换
                result.max = nums[i];
            }else if (result.min > nums[i]){
                result.min = nums[i];
            }
            result.sum += nums[i];
        }
        return result;
    }

}

class Result{
    double max,min,sum;
}