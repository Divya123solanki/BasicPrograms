abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();
}

// Circle class extends Shape
class Circle extends Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the calculateArea method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Area of a circle = πr²
    }
}

// Rectangle class extends Shape
class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor to initialize width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implementing the calculateArea method
    @Override
    public double calculateArea() {
        return width * height; // Area of a rectangle = width * height
    }
}

// Main class to test the behavior
 class Inheritance10 {
    public static void main(String[] args) {
        // Create a Circle object
        Shape circle = new Circle(5.0);
        System.out.println("Area of Circle: " + circle.calculateArea());

        // Create a Rectangle object
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}