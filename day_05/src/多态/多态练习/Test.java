package 多态.多态练习;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        Manage manage = new Manage("张总",15000,10000);
        t.showEmployeeAnnual(manage);
        t.testWork(manage);

        Works works = new Works("工人张三",5000);
        t.showEmployeeAnnual(works);
        t.testWork(works);
    }

    public void showEmployeeAnnual(Employee e){
        System.out.println(e.getName() + "获得年工资 " + e.getAnnual()); //动态绑定机制
    }

    public void testWork(Employee e){
        if (e instanceof Works){
            ((Works) e).work(); //有向下转型操作
        }else if (e instanceof Manage){
            ((Manage) e).manage();
        }else {
            System.out.println("你输入的类型错误！");
        }
    }
}
