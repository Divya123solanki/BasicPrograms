//Create a HashSet of 5 numbers. Check if a specific number exists and print whether it’s found or not.
import java.util.HashSet;
public class collection5 {
    public static void main(String args[]){
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        int k=30;
        if(numbers.contains(k)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }

    }
}