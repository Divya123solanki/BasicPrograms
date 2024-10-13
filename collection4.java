//3. LinkedList Program
//Create a LinkedList of 4 countries, add one country to the beginning and one at the end, 
//then print the list in reverse order.

import java.util.Collections;
import java.util.LinkedList;
public class collection4 {
    public static void main(String args[]){
        LinkedList <String> countries = new LinkedList<>();
        countries.add("USA");
        countries.add("India");
        countries.add("Brazil");
        countries.addFirst("canada");
        countries.addLast("Indonesia");
    Collections.reverse(countries);
    System.out.println("Countries in rverse order");
    for(String s:countries){
        System.out.println(s);
    }
    }
}
