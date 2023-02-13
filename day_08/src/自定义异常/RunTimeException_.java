package 自定义异常;

/**
 * @author 叶磊
 */
public class RunTimeException_ {
    public static void main(String[] args) {
       int age = 10;
        if (!(age >= 18 && age <= 120)){
            new CustomException("年龄必须在18--120直接");
        }
        System.out.println(age);
    }
}

class CustomException extends RuntimeException{
    public CustomException(String message) {
        super(message);
    }
}