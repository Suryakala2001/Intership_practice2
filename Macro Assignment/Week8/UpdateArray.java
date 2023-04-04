//Write a Java program to update specific array element by given element

import java.util.*;
  public class UpdateArray {
  public static void main(String[] args) {
  
  List<String> list = new ArrayList<String>();
  list.add("Red");
  list.add("Green");
  list.add("Orange");
  list.add("White");
  list.add("Black");
  System.out.println(list);
  list.set(2, "Yellow");
   System.out.println(list);
 }
}