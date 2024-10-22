//convert hashset into arraylist and print the string
import java.util.ArrayList;
public class collection6 {
    public static void main(String args[]){
        ArrayList<String> nameset = new ArrayList<>();
        nameset.add("chanchal");
        nameset.add("Divya");
        nameset.add("kanak");
        nameset.add("payal");
        ArrayList<String> nameList=new ArrayList<>(nameset);
        System.out.println(nameList);
    }
}
