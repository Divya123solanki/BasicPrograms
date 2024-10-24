//Write a java program to retrieve ,but not remove,
// the last element of a linked list 
//import com.sun.security.auth.module.LdapLoginModule;
import java.util.*;
public class collectionLinkedList {
    public static void main(String[] args) {
        
    
    LinkedList<String> list=new LinkedList<>();
   list.add("charlie");
   list.add("vrindavan");
   list.add("krishna");
   String lastElement = list.getLast();
   System.out.println("The last element"+lastElement);

}
}