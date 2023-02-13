package oop_作业.homeWork08;

public class Test {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(1000);

        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
        savingAccount.withdrew(100);
        System.out.println(savingAccount.getBalance());

//        savingAccount.earnMonthlyInterest();
    }
}
