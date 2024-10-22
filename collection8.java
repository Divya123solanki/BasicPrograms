//Create a HashMap to store 4 students' names as keys and their marks as values.
// Calculate the average marks and print it.

import java .util.HashMap;
import java.util.Map;
public class collection8 {
    public static void main(String args[]){
         HashMap<String ,Integer> marks=new HashMap<>();
         marks.put("milky",85);
         marks.put("vijay",65);
         marks.put("sumit",45);
         marks.put("goutam",75);
         int totalmarks=0;
         for (Map.Entry<String, Integer> entry : marks.entryset()) {
            totalmarks += entry.getValue();
        }

        // Calculate the average marks
        double averageMarks = totalmarks / (double) marks.size();

        // Print the average marks
        System.out.println("Average Marks: " + averageMarks);
    }
}
