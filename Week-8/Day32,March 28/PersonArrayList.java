//Create a class called "Person" with attributes "name" and "age". Create an ArrayList of Person objects and add 7 people to it. Print the name and age of each person. Find the person with the highest age and print their name and age.

import java.util.*;
class Person{
  String name;
  int age;

  Person(String name,int age){
    this.name=name;
    this.age=age;
  }
}
class PersonArrayList{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ArrayList<Person> p=new ArrayList<Person>();
    System.out.println("enter 7 people details");
    for(int i=0;i<7;i++){
      p.add(new Person(sc.next(),sc.nextInt()));
    }
    for(Person person:p){
      System.out.println("name:"+p.name+"age:"+p.age);
    }
    int maximum = p.get(0);
        for (int i = 1; i < p.size(); i++) {
            if (maximum < p.get(i))
                maximum = p.get(i);
        }
        System.out.println("Maximum Element in ArrayList = "
                           + maximum);
    
  }
}