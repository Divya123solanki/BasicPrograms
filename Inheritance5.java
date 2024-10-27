class Bank {
    // Method to get the interest rate (to be overridden by subclasses)
    public double getInterestRate() {
        return 0.0; // Default interest rate
    }
}

// SBI class inheriting Bank
class SBI extends Bank {
    // Overriding getInterestRate() method for SBI
    @Override
    public double getInterestRate() {
        return 5.5; // SBI specific interest rate
    }
}

// HDFC class inheriting Bank
class HDFC extends Bank {
    // Overriding getInterestRate() method for HDFC
    @Override
    public double getInterestRate() {
        return 6.8; // HDFC specific interest rate
    }
}

// ICICI class inheriting Bank
class ICICI extends Bank {
    // Overriding getInterestRate() method for ICICI
    @Override
    public double getInterestRate() {
        return 7.0; // ICICI specific interest rate
    }
}

// Main class
public class Inheritance5 {
    public static void main(String[] args) {
        // Using polymorphism to create Bank references
        Bank bank;

        // SBI interest rate
        bank = new SBI();
        System.out.println("SBI Interest Rate: " + bank.getInterestRate() + "%");

        // HDFC interest rate
        bank = new HDFC();
        System.out.println("HDFC Interest Rate: " + bank.getInterestRate() + "%");

        // ICICI interest rate
        bank = new ICICI();
        System.out.println("ICICI Interest Rate: " + bank.getInterestRate() + "%");
    }
}