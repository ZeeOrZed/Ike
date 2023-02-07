package Task2.Java;

public class BankAccount
{
    private double balance;
    private String owner;
    private String account_number;
    protected static int number_of_accounts =  100001;

    // Constructors
    public BankAccount()
    {
        balance = 0.0;
        account_number = Integer.toString(number_of_accounts);
        number_of_accounts++;
    }
    public BankAccount (String name, double amount)
    {
        owner = name;
        balance = amount;
        account_number = Integer.toString(number_of_accounts);
        number_of_accounts++;
    }
    public BankAccount (BankAccount account, double amount)
    {
        this.account_number = account.account_number;
        this.owner = account.owner;
        balance = amount;
    }

    // Methods
    public void deposit(double amount)
    {
        balance += amount;
    }
    public boolean withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
            return true;
        }
        else
            return false;
    }

    // Getters
    public double get_balance ()
    {
        return balance;
    }
    public String get_owner ()
    {
        return owner;
    }
    public String get_account_number ()
    {
        return account_number;
    }

    // Setters
    public void set_balance (double amount)
    {
        balance = amount;
    }
    public void set_account_number (String text)
    {
        account_number = text;
    }

}