import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Bank myBank = new Bank("OOP Federal");

    public static void main(String[] args) {

        while (true) {
            printMenu();
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        createCustomer();
                        break;
                    case 2:
                        createAccount();
                        break;
                    case 3:
                        performDeposit();
                        break;
                    case 4:
                        performWithdrawal();
                        break;
                    case 5:
                        checkBalance();
                        break;
                    case 6:
                        viewTransactionHistory();
                        break;
                    case 7:
                        System.out.println("Thank you for using OOP Federal Bank. Goodbye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Enter a number between 1–7.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); 
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n--- Banking System Menu ---");
        System.out.println("1. Create Customer");
        System.out.println("2. Create Account");
        System.out.println("3. Deposit");
        System.out.println("4. Withdraw");
        System.out.println("5. Check Balance");
        System.out.println("6. View Transaction History");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void createCustomer() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter customer address: ");
        String address = scanner.nextLine();

        Customer customer = myBank.createCustomer(name, address);
        System.out.println("Customer created: " + customer.getName() + " (ID: " + customer.getCustomerId() + ")");
    }

    private static void createAccount() {
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();

        Customer customer = myBank.getCustomer(customerId);
        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        System.out.print("Enter account type (1 for SAVINGS, 2 for CHECKING): ");
        int typeChoice = scanner.nextInt();
        scanner.nextLine();

        AccountType type = (typeChoice == 1) ? AccountType.SAVINGS : AccountType.CHECKING;

        System.out.print("Enter initial deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        Account account = myBank.createAccount(customer, type, amount);
        System.out.println("Account created: " + account);
    }

    private static void performDeposit() {
        System.out.print("Enter account number: ");
        long accountNumber = scanner.nextLong();
        scanner.nextLine();

        Account account = myBank.getAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        account.deposit(amount);
        System.out.println("✅ Deposit successful. New Balance: $" + account.getBalance());
    }

    private static void performWithdrawal() {
        System.out.print("Enter account number: ");
        long accountNumber = scanner.nextLong();
        scanner.nextLine();

        Account account = myBank.getAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        account.withdraw(amount);
        System.out.println(" Current Balance: $" + account.getBalance());
    }

    private static void checkBalance() {
        System.out.print("Enter account number: ");
        long accountNumber = scanner.nextLong();
        scanner.nextLine();

        Account account = myBank.getAccount(accountNumber);
        if (account == null) {
            System.out.println(" Account not found.");
        } else {
            System.out.println(" Current Balance: $" + account.getBalance());
        }
    }

    private static void viewTransactionHistory() {
        System.out.print("Enter account number: ");
        long accountNumber = scanner.nextLong();
        scanner.nextLine();

        Account account = myBank.getAccount(accountNumber);
        if (account == null) {
            System.out.println(" Account not found.");
        } else {
            System.out.println("--- Transaction History ---");
            for (Transaction tx : account.getTransactionHistory()) {
                System.out.println(tx);
            }
        }
    }
}
