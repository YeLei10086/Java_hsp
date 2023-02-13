package oop_作业.homeWork08;

public class SavingAccount extends BankAccount{

    private int count = 3;
    private double rate = 0.01;

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void deposit(double amount) {
        if (count > 0){
            super.deposit(amount);
        }else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdrew(double amount) {
        if (count > 0){
            super.withdrew(amount);
        }else {
            super.withdrew(amount + 1);
        }
        count--;
    }

    /**
     * 每个月除 我们统计上个月的余额利息，
     * 同时重置免手续费的次数
     */
    public void earnMonthlyInterest(){
        count = 3;
        super.deposit(getBalance() * rate);
    }
}
