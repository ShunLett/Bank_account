

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
