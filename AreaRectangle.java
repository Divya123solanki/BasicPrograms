
import java.util.Scanner;
public class AreaRectangle {
    public static void main(String args[]){
System.out.println("Enter a number:");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i;
for(i=1;i<=num;i++)
{
if(num==i*i)
break;
}
System.out.println("Square root entered number is:"+i);
    }
}

