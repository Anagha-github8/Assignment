package a6;

public class bankAccount
{
    private double balance;
    public bankAccount()
    {
        balance = 10000;
    }
    public bankAccount (double initialBalance)
    {
        balance = initialBalance;
    }
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    public void withdraw(double amount)
    {
        if(amount>balance)
        {
            throw new IllegalArgumentException("InsufficientBalanceException");
        }
        balance = balance - amount;
    }
    public double getBalance()
    {
        return balance;
    }
}
