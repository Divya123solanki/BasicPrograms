//Create a Stack of strings. Push 3 strings onto 
//the stack and then search for a specific string to find its position in the stack.
import java.util.Stack;
public class collection10 {
    public static void main(String args[]){
        Stack<String> stack=new Stack<>();
        stack.push("apple");
        stack.push("banana");
        stack.push("orange");
        System.err.println(stack);
        String searchString="banana";
        int position=stack.search(searchString);
        if(position!=-1){
            System.out.println(searchString+"is at position"+position);
        }
        else{
            System.out.println(searchString+"not found in the stack");
        }
        

    }
}
