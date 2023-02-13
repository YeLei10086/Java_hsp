package homework_;

import java.util.Scanner;

/**
 * @author 叶磊
 */
public class HomeWork02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        try {
            userRegister(s1, s2, s3);
            System.out.println("注册成功！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void userRegister(String name, String password, String email) {

        //参数校验
        if (!(name != null && password != null && email != null)){
            throw new RuntimeException("参数不能为null!");
        }

        int userLenth = name.length();
        if (!(userLenth >= 2 && userLenth <= 4)) {
            throw new RuntimeException("姓名参数错误！");
        }

        if (!(password.length() == 6 && isDigit(password))) {
            throw new RuntimeException("密码参数错误！");
        }

        int i = email.indexOf("@");
        int j = email.indexOf(".");
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱参数错误！");
        }
    }

    //判断是否为 0~9之间
    public static boolean isDigit(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!(chars[i] >= '0' && chars[i] <= '9')) {
                return false;
            }
        }
        return true;
    }
}
