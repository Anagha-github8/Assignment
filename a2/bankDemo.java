package a2;

public class bankDemo {
    public static void main(String[] args) {
        currentAccount c = new currentAccount();
        savingsAccount s = new savingsAccount();
        c.deposite(100.00);
        s.deposite(200.00);
        doWithdrawal(c);
        doWithdrawal(s);
    }

    public static void doWithdrawal(bankAccount acc) {
        boolean result = acc.withdraw(300.00);
        if (result) {
            System.out.println("Withdraw succeed.");
        } else {
            System.out.println("Withdraw failed.");
        }
    }
}



