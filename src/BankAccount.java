/**
 * Lab 4: Bank Account
 * This program contains methods for a BankAccount class for users to deposit,
 * withdraw, return the balance and return a statement with all transactions.
 * It also uses the Calendar class to record the date and time of each transaction.
 *
 * @author Shun Lett Pyae Oo (constructors)
 * @author Zaing Thint Myat (methods to deposit, withdraw, return the balance and return a statement with all transactions)
 */
import java.util.Calendar;

/**
 * The BankAccount class has methods to deposit, withdraw, check the balance,and keep a record of transactions with date and time.
 */
public class BankAccount {
    private String accountNumber;
    private double balance;
    private StringBuilder transactions;

    /**
     * constructor that initializes the account with zero balance.
     * @param accountNumber The account number assigned to this account.
     */
    public BankAccount(int accountNumber) {
        this.accountNumber = Integer.toString(accountNumber);
        this.balance = 0.0;
        this.transactions = new StringBuilder();
        logTransaction("Account created with balance: $0.0");
    }

    /**
     * constructor that initializes the account with a specified balance.
     * @param accountNumber The account number assigned to this account.
     * @param initialBalance The starting balance for the account.
     */
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.transactions = new StringBuilder();
        logTransaction("Account created with balance: $" + initialBalance);
    }
    /**
     * Deposits the amount entered by the user into the bank account.
     * @param amount The amount to deposit into the account.
     * @return true if deposit is successful, false if the amount is invalid.
     */
    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return false;
        }
        balance += amount;
        logTransaction("Deposited: $" + amount);
        return true;
    }

    /**
     * Withdraws the amount entered by the user from the bank account,
     * if sufficient balance is available.
     * @param amount The amount to withdraw.
     * @return true if withdrawal is successful, false otherwise.
     */
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return false;
        }
        balance -= amount;
        logTransaction("Withdrew: $" + amount);
        return true;
    }

    /**
     * Returns the current balance of the account.
     * @return The current balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns a string containing all transactions.
     * @return A formatted string of all recorded transactions.
     */
    public String getStatement() {
        return transactions.toString();
    }

    /**
     * Records a transaction with the current date and time.
     * @param message The transaction message to be logged.
     */
    private void logTransaction(String message) {
        Calendar now = Calendar.getInstance();
        String timestamp = String.format("%1$tF %1$tT", now);
        transactions.append("[").append(timestamp).append("] ").append(message).append("\n");
    }
}