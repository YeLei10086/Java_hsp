package list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 叶磊
 */
public class ListExercise01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("hello " + i);
        }

        list.add(1,"hspedu");
        System.out.println(list);

        System.out.println(list.get(4));

        System.out.println(list.remove(5));
        System.out.println(list);

        list.set(6,"白龙马");
        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object =  iterator.next();
            System.out.println("iterator = " + object);
        }
    }
}
