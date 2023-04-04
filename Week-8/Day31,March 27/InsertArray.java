//Write a Java program to insert an element into the array list at the first position

import java.util.*;
  public class InsertArray {
  public static void main(String[] args) {
  // Creae a list and add some colors to the list
  List<String> list = new ArrayList<String>();
  list.add("Red");
  list.add("Green");
  list.add("Orange");
  list.add("White");
  list.add("Black");
  // Print the list
  System.out.println(list);
  // Now insert a color at the first and last position of the list
  list.add(0, "Pink");
  list.add(5, "Yellow");
  // Print the list
  System.out.println(list);
 }
}