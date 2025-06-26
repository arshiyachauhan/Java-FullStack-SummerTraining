public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(Customer accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
        this.overdraftLimit = 100.0;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
            this.balance -= amount;
            this.transactionHistory.add(new Transaction(TransactionType.WITHDRAWL, amount));
            System.out.println("Withdrawal successful: $" + amount);
        } else {
            System.out.println("Withdrawal failed: Overdraft limit exceeded.");
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
