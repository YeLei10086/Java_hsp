package tuantisai;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class L1_007 {
    public static void main(String[] args) {
        Map<Character,String> map = new HashMap<Character,String>();
        map.put('-',"fu");
        map.put('0',"ling");
        map.put('1',"yi");
        map.put('2',"er");
        map.put('3',"san");
        map.put('4',"si");
        map.put('6',"liu");
        map.put('7',"qi");
        map.put('8',"ba");
        map.put('9',"jiu");

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            char k = ch[i];
            String s1 = map.get(k);
            System.out.print(s1);

            if (i != ch.length-1){
                System.out.print(" ");
            }
        }
    }
}
