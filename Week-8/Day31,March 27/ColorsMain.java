//Write a Java program to create a new array list, add some colors (string) and print out the collection
//Write a Java program to iterate through all elements in a array list
//Write a Java program to insert an element into the array list at the first position
import java.util.*;
class ColorsMain{
  
  public static void main(String args[]){
    List<String>colors=new ArrayList<String>();
    colors.add("black");
    colors.add("green");
    colors.add("red");
    //Iterator p=colors.listIterator(1);
    //System.out.println(colors);
    //System.out.println(i);
    //while(p.hasNext()){
        //System.out.println(p.next());
    //}

    String newcolors="white";
    colors.set(1,newcolors);
    System.out.println("Update colors in the ArrayList");
    for(String clr:colors){
    System.out.println(clr);
    }
  Collections.sort(colors);
  System.out.println(colors);
}
}
  
  