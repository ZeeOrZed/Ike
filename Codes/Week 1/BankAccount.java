// Zuhair Farhan, 27100
// Lecture 2 Assignment (19-01-23)

import java.util.*;

public class BankAccount
{

    private String accountNumber;
    private String accountHolderName;
    private String accountType;
    private double balance;


    // Setters

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    public void setAccountHolderName(String accountHolderName)
    {
        this.accountHolderName = accountHolderName;
    }
    public void setAccountType (String accountType)
    {
        this.accountType = accountType;
    }
    public void setBalance (double balance)
    {
        this.balance = balance;
    }


    // Getters

    public String getAccountNumber()
    {
        return accountNumber;
    }
    public String getAccountHolderName()
    {
        return accountHolderName;
    }
    public String getAccountType()
    {
        return accountType;
    }
    public double getBalance()
    {
        return balance;
    }


    // Class Methods

    public void depositAmount (double amount)
    {
        balance += amount;
    }
    public void withdrawal (double amount)
    {
        balance -= amount;
    }


    // main

    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println();

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.setAccountNumber("21bcde2");
        account1.setAccountHolderName("Tom");
        account1.setAccountType("Credit");
        account1.setBalance(2100);

        account2.setAccountNumber("56qwerty901c");
        account2.setAccountHolderName("John");
        account2.setAccountType("Debit");
        account2.setBalance(5600);


        account1.withdrawal(300);
        account1.depositAmount(500);

        account2.depositAmount(2500);
        account2.withdrawal(200);

        System.out.println("The account number of account 1 is: " + account1.getAccountNumber());
        System.out.println("The holder's name for account 1 is: " + account1.getAccountHolderName());
        System.out.println("The account type of account 1 is: " + account1.getAccountType());
        System.out.println("The account balance currently of account 1 is: " + account1.getBalance());
        System.out.println();
        System.out.println("The account number of account 2 is: " + account2.getAccountNumber());
        System.out.println("The holder's name for account 2 is: " + account2.getAccountHolderName());
        System.out.println("The account type of account 2 is: " + account2.getAccountType());
        System.out.println("The account balance currently of account 2 is: " + account2.getBalance());

    }

}
