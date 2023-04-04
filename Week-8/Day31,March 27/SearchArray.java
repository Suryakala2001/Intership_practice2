//Write a Java program to search an element in a array list.
import java.util.*;
  public class SearchArray {
  public static void main(String[] args) {
  
  List<String> list = new ArrayList<String>();
  list.add("Red");
  list.add("Green");
  list.add("Orange");
  list.add("White");
  list.add("Black");
  if (list.contains("Red")) {
    System.out.println("Found the element");
    } else {
    System.out.println("There is no such element");
    }
 }
}