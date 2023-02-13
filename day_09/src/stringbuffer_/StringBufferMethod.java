package stringbuffer_;

/**
 * @author 叶磊
 */
public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("yl");
        //增
        sb.append("zh");
        sb.append("hcy");
        sb.append(true);
        sb.append(100);
        sb.append(150.0);
        System.out.println(sb);

        //删
        //删除索引为 >= start && < end 处的字符
        // 区间：包含开头,不包含结尾
        sb.delete(14,19);
        System.out.println(sb);

        //改
        //修改索引为 >= start && < end 处的字符
        // 区间：包含开头,不包含结尾
        sb.replace(7,11,"false");
        System.out.println(sb);

        //查
        //查找指定的字串，在字符串第一次出现的索引,如果找不到就返回-1
//        int index = sb.indexOf("y");
        int index = sb.indexOf("yy");
        System.out.println(index);

        //插入
        //在索引为7的位置 插入"猪头",原来索引为7的位置自动向后移
        StringBuffer insert = sb.insert(7, "猪头");
        System.out.println(insert);

        //查看长度
        int length = sb.length();
        System.out.println(length);
    }
}
