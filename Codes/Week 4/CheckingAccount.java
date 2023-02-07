package Task2.Java;

public class CheckingAccount extends BankAccount
{
    private final static double fee = 0.15;

    // Constructors
    public CheckingAccount (String name, double amount)
    {
        super(name, amount);
        super.set_account_number(super.get_account_number()+"-10");
    }

    // Methods
    public boolean withdraw(double amount)
    {
        return super.withdraw(amount+fee);
    }

}