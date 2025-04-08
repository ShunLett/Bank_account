/**
 * Lab 4: Bank Account
 * This program contains methods for a BankAccount class for users to deposit,withdraw, return the balance and return a statement with all transactions.It also uses the Calendar class to record the date and time of each transaction.
 * @author Shun Lett Pyae Oo (constructors)
 * @author Zaing Thint Myat (methods to deposit, withdraw, return the balance and return a statement with all transactions)
 */

/**
 * The BankAccount class has methods to deposit, withdraw, check the balance and transaction with date and time.
 */
public class BankAccount {
    private String accountNumber;
    private double balance;
    private StringBuilder transactions;

    /**
     * constructor that initializes the account with zero balance.
     * @param accountNumber The account number assigned to this account.
     */
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
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
