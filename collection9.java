import java.util.Stack;
public class collection9 {
    public static void main(String args[]){
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Popping element from the stack");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
