import java.util.LinkedList;
public class collection3{
    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        int sum=0;
        for(int i: numbers){
            sum=sum+i;
        }
System.out.println(sum);
        
    }
}