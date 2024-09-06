// Base Account class
class Account {
    protected String customerName;
    protected int accNo;
    protected String accountType;
    protected double balance;

    public Account(String customerName, int accNo, String accountType, double balance) {
        this.customerName = customerName;
        this.accNo = accNo;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

// Derived class for SavingsAccount
class SavingsAccount extends Account {
    private double interestRate = 0.04;  // 4% interest rate

    public SavingsAccount(String customerName, int accNo, double balance) {
        super(customerName, accNo, "Savings", balance);
    }

    // Method to compute and deposit interest
    public void computeAndDepositInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }
}

// Derived class for CurrentAccount
class CurrentAccount extends Account {
    private double minimumBalance = 1000;  // Minimum balance required
    private double penalty = 50;  // Penalty for not maintaining minimum balance

    public CurrentAccount(String customerName, int accNo, double balance) {
        super(customerName, accNo, "Current", balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            checkMinimumBalance();
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    // Method to check minimum balance and impose penalty
    public void checkMinimumBalance() {
        if (balance < minimumBalance) {
            balance -= penalty;
            System.out.println("Penalty imposed: " + penalty);
        }
    }
}

// Main class
public class BankApplication {
    public static void main(String[] args) {
        // Creating a savings account
        SavingsAccount savings = new SavingsAccount("John Doe", 12345, 5000);
        savings.displayBalance();
        savings.deposit(1000);
        savings.computeAndDepositInterest();
        savings.withdraw(2000);
        savings.displayBalance();

        // Creating a current account
        CurrentAccount current = new CurrentAccount("Jane Doe", 67890, 2000);
        current.displayBalance();
        current.withdraw(1500);
        current.displayBalance();
        current.withdraw(700);
        current.displayBalance();
    }
}


/* Output
Balance: 5000.0
Amount deposited: 1000.0
Interest added: 240.0
Amount withdrawn: 2000.0
Balance: 4240.0
Balance: 2000.0
Amount withdrawn: 1500.0
Penalty imposed: 50.0
Balance: 450.0
Invalid or insufficient funds for withdrawal.
Balance: 450.0
*/
