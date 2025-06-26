public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(Customer accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
        this.interestRate = 0.02; // 2% interest
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        transactionHistory.add(new Transaction(TransactionType.DEPOSIT, interest));
        System.out.println("Interest applied: $" + interest);
    }

    @Override
    public String toString() {
        return "SavingsAccount {" +
               "Account Number: " + accountNumber +
               ", Holder: " + accountHolder.getName() +
               ", Balance: $" + balance +
               ", Interest Rate: " + (interestRate * 100) + "%" +
               "}";
    }
}
