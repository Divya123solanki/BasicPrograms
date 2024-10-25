class Animal {
    // Method to make a sound (to be overridden by subclasses)
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Dog class inheriting Animal
class Dog extends Animal {
    // Overriding makeSound() method for Dog
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof Woof");
    }
}

// Cat class inheriting Animal
class Cat extends Animal {
    // Overriding makeSound() method for Cat
    @Override
    public void makeSound() {
        System.out.println("The cat meows: Meow Meow");
    }
}

// Main class
public class Inheritance3 {
    public static void main(String[] args) {
        // Creating a Dog object
        Animal dog = new Dog();
        System.out.println("Dog:");
        dog.makeSound(); // Displays dog's sound

        // Creating a Cat object
        Animal cat = new Cat();
        System.out.println("Cat:");
        cat.makeSound(); // Displays cat's sound
    }
}