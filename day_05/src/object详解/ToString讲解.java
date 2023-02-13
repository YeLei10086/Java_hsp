package object详解;

public class ToString讲解 {
    public static void main(String[] args) {

        /*
           Object 类 toString() 源码:
            1.getClass().getName() 类的全类名(指包名+类名)
            2.Integer.toHexString(hashCode()) 将对象的 hashcode值 转换成 16进制字符串

           public String toString() {
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
            }
         */

        //没有进行重写 toString()方法前
        // 输出: Object详解.Monster@1b6d3586

        //重写 toString()方法后
        //输出: Monster{name='小妖怪', job='巡山'}
        Monster monster = new Monster("小妖怪", "巡山");
        System.out.println("没有进行重写 toString()方法前：" + monster.toString() + "\thashcode值 = " + monster.hashCode());

        System.out.println("==当直接输出一个对象时,toString() 方法会被默认调用==");
        System.out.println(monster);

    }
}

class Monster{

    private String name;
    private String job;

    public Monster(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}