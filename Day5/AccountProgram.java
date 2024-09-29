package Day5;

import java.util.Scanner;

// Public class Account
 class Account {
    // Private attributes
    private int id;
    private String accountType;
    private double balance;

    // Empty constructor
    public Account() {
    }

    // 3-parameter constructor to initialize fields
    public Account(int id, String accountType, double balance) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for accountType
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to withdraw an amount
    public boolean Withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    // Method to get account details as a string
    public String GetDetails() {
        return "Account Id: " + id + "\nAccount Type: " + accountType + "\nBalance: " + balance;
    }
}

// Public class Program for main method
public class AccountProgram {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get account details from user
        System.out.print("Enter account id: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter account type: ");
        String accountType = scanner.nextLine();

        System.out.print("Enter account balance: ");
        double balance = scanner.nextDouble();

        // Create Account object using the 3-parameter constructor
        Account account = new Account(id, accountType, balance);

        // Display account details
        System.out.println("\n" + account.GetDetails());

        // Ask for amount to withdraw
        System.out.print("\nEnter amount to withdraw: ");
        double amountToWithdraw = scanner.nextDouble();

        // Try to withdraw amount
        if (account.Withdraw(amountToWithdraw)) {
            System.out.println("New Balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
