package a2;

public class currentAccount extends bankAccount {
    public boolean doWithdrawal(double amount) {
        balance -= amount;
        return true;
    }
}
