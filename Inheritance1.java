class Person {
    // Attributes
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details of Person
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Employee class (Subclass of Person)
class Employee extends Person {
    // Attribute
    double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        super(name, age); // Call the superclass (Person) constructor
        this.salary = salary;
    }

    // Method to display details of Employee (including Person details)
    public void displayEmployeeDetails() {
        displayPersonDetails(); // Display Person details
        System.out.println("Salary: $" + salary);
    }
}

// Main class
public class Inheritance1 {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("John Doe", 30);
        System.out.println("Person Details:");
        person.displayPersonDetails();

        System.out.println();

        // Creating an Employee object
        Employee employee = new Employee("Jane Smith", 28, 75000);
        System.out.println("Employee Details:");
        employee.displayEmployeeDetails();
    }
}