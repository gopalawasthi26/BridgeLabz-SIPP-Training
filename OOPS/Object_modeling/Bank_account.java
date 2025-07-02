import java.util.ArrayList;
import java.util.List;

// Bank class
class Bank {
    String name;
    List<Account> accounts = new ArrayList<>();

    Bank(String name) {
        this.name = name;
    }

    // Open a new account for a customer
    public Account openAccount(Customer customer, double initialBalance) {
        Account account = new Account(customer, this, initialBalance);
        accounts.add(account);
        customer.addAccount(account); // link account to customer
        System.out.println("Account opened for " + customer.name + " at " + name);
        return account;
    }
}

// Customer class
class Customer {
    String name;
    List<Account> accounts = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    // Add account to customer's list
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // View balances of all accounts
    public void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (Account acc : accounts) {
            System.out.println("Bank: " + acc.bank.name + ", Balance: " + acc.balance);
        }
    }
}

// Account class (used to link Customer and Bank)
class Account {
    Customer customer;
    Bank bank;
    double balance;

    Account(Customer customer, Bank bank, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.balance = balance;
    }
}
public class BankApp {
    public static void main(String[] args) {
        Bank sbi = new Bank("SBI");
        Bank hdfc = new Bank("HDFC");

        Customer gopal = new Customer("Gopal Awasthi");
        Customer anita = new Customer("Anita Sharma");

        sbi.openAccount(gopal, 5000);
        hdfc.openAccount(gopal, 3000);

        sbi.openAccount(anita, 10000);

        gopal.viewBalance();
        anita.viewBalance();
    }
}
