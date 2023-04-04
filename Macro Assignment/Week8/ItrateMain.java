//Write a Java program to iterate through all elements in a array list

import java.util.ArrayList;

class ItrateMain {
  public static void main(String[] args) {
   
    ArrayList<String> list = new ArrayList<>();
    list.add("Java");
    list.add("JavaScript");
    list.add("Python");
    System.out.println("ArrayList: " + list);
    //using loop
    System.out.println("Iterating over ArrayList using for loop: ");

    for(int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i));
      System.out.print(" ");
    }
  }
}