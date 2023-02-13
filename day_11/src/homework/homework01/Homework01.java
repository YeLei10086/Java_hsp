package homework.homework01;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 叶磊
 */


public class Homework01 {

    @Test
    public static void main(String[] args) {
        Dao<User> userDao = new Dao<>();
        userDao.save("1001",new User(1, "tom", 20));
        userDao.save("1002",new User(2, "jack", 25));
        userDao.save("1003",new User(3, "marry", 18));
        List<User> list = userDao.list();
        System.out.println(list);

        userDao.update("1001",new User(15, "猪头", 20));
        list = userDao.list();
        System.out.println(list);

        userDao.delete("1003");
        list = userDao.list();
        System.out.println(list);

        System.out.println(userDao.get("1002"));

    }
}
