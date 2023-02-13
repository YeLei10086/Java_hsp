package interface_.接口多态数组;

public class InterfacePloyArr {
    public static void main(String[] args) {

        //多态数组 -->  接口类型数组
        Usbs[] usbs = new Usbs[2];
        usbs[0] = new Phone();
        usbs[1] = new Camera();

        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();     //进行动态绑定
            if (usbs[i] instanceof Phone){
                ((Phone) usbs[i]).call();      //进行向下转型
            }else if (usbs[i] instanceof Camera){

            }
        }
    }
}
