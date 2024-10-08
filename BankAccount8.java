public class BankAccount8 {
    // Private attributes
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    // Constructor to initialize account details
    public BankAccount8(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money, ensuring balance doesn't become negative
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew: " + amount + ". New balance: " + balance);
            } else {
                System.out.println("Insufficient balance. Current balance: " + balance);
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check the current balance
    public double getBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        BankAccount8 account = new BankAccount8("123456789", "John Doe", 500.0);
        
        // Display initial account details
        account.displayAccountDetails();

        // Deposit money
        account.deposit(200.0);

        // Withdraw money
        account.withdraw(100.0);

        // Attempt to withdraw more than the current balance
        account.withdraw(700.0);

        // Display final account details
        account.displayAccountDetails();
    }
}