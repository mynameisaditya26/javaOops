// abstract class Vehicle{ // abstract class
//     abstract void start(); // abstract method
//     void stop(){
//         System.out.println("Vehicle stops.");
//     }
// }

// class Car extends Vehicle {
//     void start(){
//         System.out.println("Car starts with a key.");
//     }
// }

// class Bike extends Vehicle {
//     void start(){
//         System.out.println("Bike starts with a button.");
//     }
// }


// public class abstracts {
//     public static void main(String[] args){
//         Car c = new Car();
//         c.start();
//         c.stop();
//         System.out.println();
//         Bike b = new Bike();
//         b.start();
//         b.stop();
//     }
// }


import java.util.HashMap;

abstract class BankAccount {

    private String accountHolder;
    private int accountNumber;
    protected double balance;

    // HashMap to store all bank accounts
    static HashMap<Integer, BankAccount> accounts = new HashMap<>();

    // Constructor
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;

        // Store account in HashMap
        accounts.put(accountNumber, this);
    }

    // Normal method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    // Abstract method
    abstract void withdraw(double amount);

    // Display account details
    void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Find account using account number
    static void findAccount(int accountNumber) {

        BankAccount account = accounts.get(accountNumber);

        if (account != null) {
            account.displayAccount();
        } else {
            System.out.println("Account not found.");
        }
    }

    // Display total number of accounts
    static void totalAccounts() {
        System.out.println("Total Accounts: " + accounts.size());
    }
}


// Savings Account
class SavingsAccount extends BankAccount {

    SavingsAccount(String accountHolder, int accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {

        if (balance - amount >= 1000) {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Minimum balance of 1000 required.");
        }
    }
}


// Current Account
class CurrentAccount extends BankAccount {

    CurrentAccount(String accountHolder, int accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {

        if (amount <= balance + 5000) {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}


public class abstracts {

    public static void main(String[] args) {

        // Creating accounts
        BankAccount a1 =
            new SavingsAccount("Rahul", 101, 10000);

        BankAccount a2 =
            new CurrentAccount("Amit", 102, 5000);

        BankAccount a3 =
            new SavingsAccount("Priya", 103, 15000);

        // Total accounts
        BankAccount.totalAccounts();

        System.out.println();

        // Find account using account number
        System.out.println("Searching Account 102:");

        BankAccount.findAccount(102);

        System.out.println();

        // Deposit
        a2.deposit(2000);

        // Withdraw
        a2.withdraw(5000);

        System.out.println();

        // Display updated account
        BankAccount.findAccount(102);
    }
}