package list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 叶磊
 */
public class List_ {
    public static void main(String[] args) {
        // 1.List集合类中，元素是有序的(即添加顺序和取出顺序一致)、且可重复
        List list = new ArrayList();
        list.add("猪头");
        list.add("狗头");
        list.add("牛头");
        list.add("狗头");
        list.add("猪头");
        System.out.println("list = " + list);

        // 2.List集合中的每个元素都有其对应的顺序索引,即支持索引,且索引是从0开始的
        System.out.println(list.get(2));    //牛头

    }
}
