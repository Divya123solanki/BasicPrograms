abstract class Animal {
    // Abstract method (no body)
    public abstract void makeSound();
}

// Dog class extends Animal
class Dog extends Animal {
    // Implementing the abstract method makeSound()
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

// Cat class extends Animal
class Cat extends Animal {
    // Implementing the abstract method makeSound()
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

// Main class to test the behavior
public class Inheritance9 {
    public static void main(String[] args) {
        // Create objects of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call the makeSound() method on both objects
        dog.makeSound(); // Outputs: Woof Woof
        cat.makeSound(); // Outputs: Meow Meow
    }
}
