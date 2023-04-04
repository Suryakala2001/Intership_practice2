//Write a Java program to sort a given array list

import java.util.*;
  public class SortArray {
  public static void main(String[] args) {
  
  List<String> list = new ArrayList<String>();
  list.add("Red");
  list.add("Green");
  list.add("Orange");
  list.add("White");
  list.add("Black");
  System.out.println("List before sort: "+list);
  Collections.sort(list);
  System.out.println("List after sort: "+list);    
 }
}