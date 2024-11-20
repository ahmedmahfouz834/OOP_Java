import java.util.*;
public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("12345678", "Alice Johnson", 1000.0);


        System.out.println("Initial Account Info:");
        account.displayInfo();


        account.deposit(500.0);

        account.withdraw(200.0);


        System.out.println("\nUpdated Account Info:");
        account.displayInfo();
    }
}

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;


    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }


    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}