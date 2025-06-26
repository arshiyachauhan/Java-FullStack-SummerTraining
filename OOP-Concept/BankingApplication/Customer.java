import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer {
    private final String customerId;
    private String name;
    private String address;
    private final List<Account> accounts;

    public Customer(String name, String address) {
        this.customerId = UUID.randomUUID().toString();
        this.name = name;
        this.address = address;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }
}
