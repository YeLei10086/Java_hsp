package customgeneric;

/**
 * @author 叶磊
 */
public class GenericExtends {
    public static void main(String[] args) {
        //1、泛型不具备继承性
        //     ArrayList<Object> list = new ArrayList<String>();

        //2、<?>: 支持任意泛型类型
        //3、<? extends A>: 支持A类以及A类的子类,规定了泛型的上限
        //4、<? super A>: 支持A类以及A类的父类,不限于直接父类,规定了泛型的下限

    }
}
