class Student {
    // Attributes of the Student class
    private String name;
    private int rollNo;
    private double totalMarks;

    // Parameterized constructor
    public Student(String name, int rollNo, double totalMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.totalMarks = totalMarks;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for rollNo
    public int getRollNo() {
        return rollNo;
    }

    // Setter for rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Getter for totalMarks
    public double getTotalMarks() {
        return totalMarks;
    }

    // Setter for totalMarks
    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    // Override the toString() method
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", totalMarks=" + totalMarks +
                '}';
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a student object using the parameterized constructor
        Student student1 = new Student("Krishna", 101, 95.5);

        // Displaying student details using the overridden toString() method
        System.out.println(student1);

        // Modifying student details using setters
        student1.setName("Radha");
        student1.setRollNo(102);
        student1.setTotalMarks(98.2);

        // Displaying updated student details
        System.out.println(student1);
    }
}