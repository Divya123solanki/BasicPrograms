class Student {
    // Private attributes
    private String name;
    private int rollNumber;
    private double marks;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }

    // Setter method for rollNumber
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Getter method for marks
    public double getMarks() {
        return marks;
    }

    // Setter method for marks
    public void setMarks(double marks) {
        this.marks = marks;
    }
}

// Main class
public class Inheritance7 {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student();

        // Setting values using setter methods
        student.setName("John Doe");
        student.setRollNumber(101);
        student.setMarks(85.5);

        // Accessing values using getter methods
        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Marks: " + student.getMarks());
    }
}