import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public abstract class Account {
    private static final AtomicLong count = new AtomicLong(100000);
    protected long accountNumber;
    protected Customer accountHolder;
    protected double balance;
    protected List<Transaction> transactionHistory;

    public Account(Customer accountHolder, double initialBalance) {
        this.accountNumber = count.incrementAndGet();
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        if (initialBalance > 0) {
            this.transactionHistory.add(new Transaction(TransactionType.DEPOSIT, initialBalance));
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            this.transactionHistory.add(new Transaction(TransactionType.DEPOSIT, amount));
            System.out.println("Deposit successful: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            this.transactionHistory.add(new Transaction(TransactionType.WITHDRAWL, amount));
            System.out.println("Withdrawal successful: $" + amount);
        } else {
            System.out.println("Withdrawal failed: Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public List<Transaction> getTransactionHistory() {
        return new ArrayList<>(transactionHistory);
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
               ", Holder: " + accountHolder.getName() +
               ", Balance: $" + balance;
    }
}
