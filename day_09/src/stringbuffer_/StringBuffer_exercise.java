package stringbuffer_;

/**
 * @author 叶磊
 */
public class StringBuffer_exercise {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        /**
         *     private AbstractStringBuilder appendNull() {
         *         int c = count;
         *         ensureCapacityInternal(c + 4);
         *         final char[] value = this.value;
         *         value[c++] = 'n';
         *         value[c++] = 'u';
         *         value[c++] = 'l';
         *         value[c++] = 'l';
         *         count = c;
         *         return this;
         *     }
         */
        sb.append(str); //断点看源码，底层调用的是AbstractStringBuilder appendNull()
        System.out.println(sb.length());    // 4
        System.out.println(sb); //null

        StringBuffer sb2 = new StringBuffer(str);
        System.out.println(sb2);
    }
}
