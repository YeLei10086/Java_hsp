package 面试题;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author YeLei
 * @Date 2021/11/02 13:26
 * @Version 1.0
 */
public class Test04 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("world");

        /*利用LinkedHashSet有序不重复的特性*/
        LinkedHashSet linkedHashSet = new LinkedHashSet();

        for (int i = 0; i < words.size(); i++) {
            /*先取出单个字符串*/
            String s = words.get(i);
            /*再将其切割成字符串数组*/
            String[] split = s.split("");
            for (String ss : split) {
                linkedHashSet.add(ss);
            }
        }
        System.out.println(linkedHashSet);
    }

    void reverse(char[] data){
        for (int i = data.length-1; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
}
