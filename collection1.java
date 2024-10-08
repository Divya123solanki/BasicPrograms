import java.util.ArrayList;
import java.util.Collections;

public class collection1 {
    public static void main(String[] args) {
        // Create an ArrayList of city names
        ArrayList<String> cities = new ArrayList<>();

        // Add 5 city names to the list
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Kolkata");
        cities.add("Bangalore");
        cities.add("Chennai");

        // Sort the cities in alphabetical order
        Collections.sort(cities);

        // Print the sorted list of cities
        System.out.println("Sorted list of cities: " + cities);
    }
}