public class AreaTriangle {
    public static void main(String args[]){
         int p=36,a=10,b=9,c,s,t;
         c=p-(a+b);
         s=p/2;
         t=s*(s-a)*(s-b)*(s-c);
         System.out.println(t);
       double result=Math.sqrt(t);
       System.out.println(result);

    }
}
