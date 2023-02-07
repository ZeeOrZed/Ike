package Task2.Java;

public class SavingsAccount extends  BankAccount
{
    private static double rate = 0.025;
    private static int savings_number = 0;
    private static String account_number;

    // Constructor
    public SavingsAccount(String name, double amount)
    {
        super(name,amount);
        account_number = super.get_account_number()+"-"+savings_number;
        savings_number++;
    }
    public SavingsAccount (SavingsAccount account, double amount)
    {
        super (account, amount);
        account_number = super.get_account_number()+"-"+savings_number;
        savings_number++;
    }

    // Methods
    public void post_interest()
    {
        super.deposit(super.get_balance()*rate);
    }

    // Getter
    public String get_account_number()
    {
       return account_number;
    }

}