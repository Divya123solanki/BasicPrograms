public class Value {
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int temp=0;
        int n=2;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==n){
                    System.out.print("value found");
                }
                else{
                    System.out.print("not found");
                }
            }
        }
    }
}
