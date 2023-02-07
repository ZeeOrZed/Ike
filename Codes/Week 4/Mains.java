package Task2.Java;

public class Mains
{
    public static void main (String[] args)
    {
        BankAccount bank_account1 = new BankAccount();
        bank_account1.deposit(5.0);
        System.out.println(bank_account1.withdraw(6.0));
        System.out.println(bank_account1.withdraw(3.0));
        System.out.println(bank_account1.get_account_number());
        System.out.println(bank_account1.get_balance());
        System.out.println(bank_account1.get_owner());

        System.out.println();
        BankAccount bank_account2 = new BankAccount("John", 15.0);
        System.out.println(bank_account2.withdraw(6.0));
        System.out.println(bank_account2.withdraw(3.0));
        System.out.println(bank_account2.get_account_number());
        System.out.println(bank_account2.get_balance());
        System.out.println(bank_account2.get_owner());

        System.out.println();
        BankAccount bank_account3 = new BankAccount(bank_account1, 2.0);
        System.out.println(bank_account3.withdraw(6.0));
        System.out.println(bank_account3.withdraw(3.0));
        System.out.println(bank_account3.get_account_number());
        System.out.println(bank_account3.get_balance());
        System.out.println(bank_account3.get_owner());


        System.out.println();
        CheckingAccount checkingAccount_account = new CheckingAccount("Mikey", 50.00);
        System.out.println(checkingAccount_account.withdraw(21.0));


        System.out.println();
        SavingsAccount saving_account1 = new SavingsAccount("Jacob", 100.0);
        saving_account1.post_interest();
        System.out.println(saving_account1.get_balance());
        System.out.println(saving_account1.get_account_number());

        System.out.println();
        SavingsAccount saving_account2 = new SavingsAccount(saving_account1, 100.0);
        System.out.println(saving_account2.get_balance());
        saving_account2.post_interest();
        System.out.println(saving_account2.get_balance());
        System.out.println(saving_account2.get_account_number());

        System.out.println();

    }
}
