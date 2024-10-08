import java.util.ArrayList;

    public class collection2 {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add 5 numbers to the list
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        // Remove all odd numbers
        numbers.removeIf(n -> (n % 2 != 0));

        // Print the final list
        System.out.println("Final list after removing odd numbers: " + numbers);
    }
}
