//Write a Java program to retrieve an element (at a specified index) from a given array list

import java.util.*;
  public class RetrieveArray {
  public static void main(String[] args) {
  
  List<String> list = new ArrayList<String>();
  list.add("Red");
  list.add("Green");
  list.add("Orange");
  list.add("White");
  list.add("Black");
  System.out.println(list);
  
  String element = list.get(0);
  System.out.println("First element: "+element);
  element = list.get(2);
  System.out.println("Third element: "+element);
 }
}