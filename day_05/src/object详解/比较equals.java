package object详解;

public class 比较equals {
    public static void main(String[] args) {
        int a = 10;
        double b = 10.0;
        System.out.println(b == a); //true

        Object A = new Object();
        Object B = A;
        Object C = B;

        System.out.println(C == B); // 比较的是地址是否相等

        "123".equals(345);
        /*
        public boolean equals(Object anObject) {
        if (this == anObject) { //如果这个对象是同一个对象，直接返回true；
            return true;
        }
        if (anObject instanceof String) {   //如果传进来的这个对象是String类型或者是其String下的子类
            String anotherString = (String)anObject;    //向下转型操作
            int n = value.length;
            if (n == anotherString.value.length) {  //比较长度是否相等
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {  //循环比较两个对象的值
                    if (v1[i] != v2[i]) //只要有一个不相等，返回false;
                        return false;
                    i++;
                }
                return true;    //都相等返回true；
            }
        }
        return false;   //如果比较的不是字符串 ，直接返回false；
    }
         */
    }
}
