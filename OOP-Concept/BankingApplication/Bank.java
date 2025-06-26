import java.util.HashMap;
import java.util.Map;

public class Bank {
    public String bankName;
    private Map<String, Customer> customers;
    private Map<Long, Account> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new HashMap<>();
        this.accounts = new HashMap<>();
    }

    public Customer createCustomer(String name, String address) {
        Customer customer = new Customer(name, address);
        customers.put(customer.getCustomerId(), customer);
        return customer;
    }

    public Account createAccount(Customer customer, AccountType type, double initialDeposit) {
        Account account = null;
        switch (type) {
            case SAVINGS:
                account = new SavingsAccount(customer, initialDeposit);
                break;
            case CHECKING:
                account = new CheckingAccount(customer, initialDeposit);
                break;
        }

        if (account != null) {
            accounts.put(account.getAccountNumber(), account);
            customer.addAccount(account);
        }

        return account;
    }

    public Account getAccount(long accountNumber) {
        return accounts.get(accountNumber);
    }

    public Customer getCustomer(String customerId) {
        return customers.get(customerId);
    }
}
