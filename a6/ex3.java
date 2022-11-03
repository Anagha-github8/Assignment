package a6;

public class ex3
{
    public static void main(String[] args)
    {
        bankAccount Account = new bankAccount();
        Account.deposit(2000);
        Account.withdraw(13000);
        System.out.println(Account.getBalance());
    }
}
