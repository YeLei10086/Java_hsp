package interface_.接口多态传递;

public class InterfacePloyPass {
    public static void main(String[] args) {
        //接口类型的变量可以指向,实现了该接口的类的对象实例
        InterfaceB iB = new Teacher();
        // 如果 InterfaceB 继承了 InterfaceA, 而 Teacher类 实现了 InterfaceB 接口
        // 那么实际上就相当于 Teacher类 也实现了 InterfaceA 接口,这种使用方法就叫接口多态传递
        InterfaceA iA = new Teacher();
    }
}

interface InterfaceA{}

interface InterfaceB extends InterfaceA{}

class Teacher implements InterfaceB{}