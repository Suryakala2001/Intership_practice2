//Write a Java program to extract a portion of a array list.
import java.util.*;
  public class ExtractPortion {
  public static void main(String[] args) {
  
  List<String> list = new ArrayList<String>();
  list.add("Red");
  list.add("Green");
  list.add("Orange");
  list.add("White");
  list.add("Black");
  System.out.println("Original list: " + list);
  List<String> sub_List = list.subList(0, 3);
  System.out.println("List of first three elements: " + sub_List);
 }
}