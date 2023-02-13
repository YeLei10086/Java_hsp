package system_;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author 叶磊
 */
public class System_ {
    public static void main(String[] args) {
        //exit() 退出当前程序
        System.out.println("ok1~");
//        System.exit(0); // 0代表一个状态码  正常退出
        System.out.println("ok2~");

        //arraycopy : 复制数组元素，比较适合底层调用
        // 一般使用Arrays.copyOf 完成复制数组
        /**
         * @param      src      the source array.   //源数组
         * @param      srcPos   starting position in the source array.  //从源数组的第几个索引位置开始拷贝
         * @param      dest     the destination array.  //目标数组  (把源数组拷贝到这)
         * @param      destPos  starting position in the destination data.  //把源数组的数据，拷贝到 目标数组的第几个索引位置
         * @param      length   the number of array elements to be copied.  //拷贝多少个数据到目标数组
         */
        int[] src = {1,2,3};
        int[] dest = new int[3];    //当前 dest = {0,0,0}
//        System.arraycopy(src,0,dest,0,src.length);   // 1 2 3
        System.arraycopy(src,0,dest,0,src.length-1);   // 1 2 0
//        System.arraycopy(src,1,dest,0,2);   // 2 3 0
        System.out.println(Arrays.toString(dest));


        System.currentTimeMillis();
    }
}
