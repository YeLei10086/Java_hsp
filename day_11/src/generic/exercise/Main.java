package generic.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author 叶磊
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("tom",5000,new MyDate(1998,3,21)));
        list.add(new Employee("jack",3000,new MyDate(1999,10,18)));
        list.add(new Employee("marry",8000,new MyDate(1998,8,30)));
        list.add(new Employee("marry",6000,new MyDate(1998,5,25)));
        System.out.println("未进行排序前：");
        System.out.println(list);
        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                //先对传入的参数进行验证!
                if (!(o1 instanceof Employee && o2 instanceof Employee)) {
                    System.out.println("类型不匹配！");
                    return 0;
                }

                //比较name
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0){
                    return i;
                }

                //下面是对 Birthday 的比较,因此,我们做好把它这个比较,放在MyDate类完成
                //封装后,将来可维护性和复用性,大大增强
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        System.out.println("进行排序后：");
        System.out.println(list);
    }
}
