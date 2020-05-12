package pl.orlowski.sebastian.samouczekjava.a14modyfikatorydostepu.exerciseone;

public class Transfer implements BankTransfer{
    private final int TAX = 1;


    @Override
    public void transfer(BankAccount from, BankAccount to, int amount) {
        if(from.getBalance() > amount + TAX) {
            from.withdraw(amount + TAX);
            to.deposit(amount);
        }
        else {
            System.out.println("Not enough money in your account!");
        }
    }

    public static void main(String[] args) {
        Transfer transfer = new Transfer();
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        account1.balance = 5000;
        account2.balance = 100;

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());

        //Przelewam 1500 złoty z account 1 na account 2
        transfer.transfer(account1, account2, 1500);
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());

        // Przelewam 1000 złoty z account 2 na account 1
        transfer.transfer(account2, account1, 1000);
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());

    }
}
