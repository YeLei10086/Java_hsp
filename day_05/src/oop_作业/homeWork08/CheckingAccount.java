package oop_作业.homeWork08;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    }

    @Override
    public void withdrew(double amount) {
        super.withdrew(amount + 1);
    }
}
