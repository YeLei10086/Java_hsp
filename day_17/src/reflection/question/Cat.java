package reflection.question;

/**
 * @author 叶磊
 */
public class Cat {
    public String name = "招财猫";

    public Cat() {
    }

    public Cat(String name){
        this.name = name;
    }

    public void hi() {
        System.out.println("你好" + name);
    }
}
