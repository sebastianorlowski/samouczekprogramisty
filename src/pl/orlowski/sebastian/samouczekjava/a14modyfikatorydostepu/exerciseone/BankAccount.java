package pl.orlowski.sebastian.samouczekjava.a14modyfikatorydostepu.exerciseone;

public class BankAccount implements Account {
    protected int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    protected int getBalance() {
        return balance;
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
    }

    @Override
    public void withdraw(int amount) {
        balance -= amount;
    }
}
