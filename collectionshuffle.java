//Write a java program to shuffle elements in an array list
import java.util.*;
class collectionshuffle{
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<>();
        al.add("shyam");
        al.add("rahul");
        al.add("charlie");
        al.add("Date");
        System.out.println("original List"+al);
        Collections.shuffle(al);
        System.out.println("shuffled list"+al);
    }
}