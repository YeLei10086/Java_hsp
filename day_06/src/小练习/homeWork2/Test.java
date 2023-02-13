package 小练习.homeWork2;

/**
 * @author 叶磊
 */
public class Test {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.testWork(new IComputer() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },10,10);

        cellPhone.testWork(new IComputer() {
            @Override
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        },10,8);
    }
}
