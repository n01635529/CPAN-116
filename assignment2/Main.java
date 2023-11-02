package assignment2;

public class Main {
    
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("100000", "David Smith");
        account1.deposit(3000.50);
        account1.displayBalance();

        BankAccount account2 = new BankAccount("100001", "Emily Lee");
        account2.deposit(850);
        account2.withdraw(400.85);
        account2.displayBalance();

         System.out.println("Total number of accounts: " + BankAccount.numberOfAccounts);
    }
    
}
