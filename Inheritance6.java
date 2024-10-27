class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}

// Main class
public class Inheritance6 {
    public static void main(String[] args) {
        // Creating a Calculator object
        Calculator calculator = new Calculator();

        // Calling the add() method for two integers
        System.out.println("Sum of two integers (3 + 5): " + calculator.add(3, 5));

        // Calling the add() method for three integers
        System.out.println("Sum of three integers (2 + 4 + 6): " + calculator.add(2, 4, 6));

        // Calling the add() method for two double values
        System.out.println("Sum of two doubles (2.5 + 3.8): " + calculator.add(2.5, 3.8));
    }
}