abstract class Shape {
    // Abstract method to calculate the area
    abstract double calculateArea();
}

// Circle class inheriting Shape
class Circle extends Inheritance10 {
    // Attribute for radius
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding calculateArea() to calculate the area of a circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class inheriting Shape
class Rectangle extends Inheritance10 {
    // Attributes for length and width
    double length;
    double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding calculateArea() to calculate the area of a rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Main class
public class Inheritance2 {
    public static void main(String[] args) {
        // Creating a Circle object
        Circle circle = new Circle(5.0); // radius = 5.0
        System.out.println("Area of Circle: " + circle.calculateArea());

        // Creating a Rectangle object
        Rectangle rectangle = new Rectangle(4.0, 6.0); // length = 4.0, width = 6.0
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
