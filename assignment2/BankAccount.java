package assignment2;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    public static final double INTEREST_RATE = 0;
    public static int numberOfAccounts = 0;

    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        numberOfAccounts++;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: $" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");

        }   else {
            System.out.println("Invalid deposit amount. ");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw of $" + amount + " successful.");

        }   else {
            System.out.println("Invalid withdraw amount or insufficient balance. ");
        }
    }
}
