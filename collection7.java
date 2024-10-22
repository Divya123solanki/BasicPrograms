//Create a HashMap with 3 product names as keys and their prices as values.
// Update the price of one product and display the updated map.
import java.util.HashMap;
public class collection7 {
    public static void main(String args[]){
        HashMap<String , Double> productprice = new HashMap<>();
        productprice.put("Laptop",50000.00);
        productprice.put("smartphone",60000.00);
        productprice.put("T.V",80000.00);
        System.out.println("previous value print"+productprice);
        productprice.put("smartphone",45000.00);
        System.out.println("After modifiaction"+productprice);
    }
}
