package pl.orlowski.sebastian.samouczekjava.a14modyfikatorydostepu.exerciseone;
// Napisz program, który będzie symulował działanie banku. Zaimplementuj następujące interfejsy:
//
//public interface Account {
//    void deposit(int amount);
//    void withdraw(int amount);
//}
//public interface BankTransfer {
//    void transfer(BankAccount from, BankAccount to, int amount);
//}
// Bank przeprowadzający operację przesyłu środków pobiera stałą opłatę 1zł od nadawcy przelewu. Jakich modyfikatorów dostępu użyjesz? Dlaczego akurat tych?
public interface Account {
    void deposit(int amount);
    void withdraw(int amount);
}
