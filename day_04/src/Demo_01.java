public class Demo_01 {
    /**
     * 创建一个char类型的26个元素的数组，分别放置'A'-'Z'.
     * 使用for循环访问所有元素，并打印出来
     * 提示：char类型数据运算'A'+1 --> B,'0'+1 --> '1'
     * @param args
     */
    public static void main(String[] args) {
        char[] ch = new char[26];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char) ('A' + i);
        }
        System.out.println("======================");

        for (int i = 0; i < ch.length ; i++) {
            System.out.print(ch[i] + "\t");
        }
    }
}
