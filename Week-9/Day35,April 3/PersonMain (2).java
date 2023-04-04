//Write a Java class called Person that has fields for the person's name and age. Write a custom Comparator implementation called AgeComparator that sorts Person objects in ascending order based on their age. Then, modify the Person class to implement the Comparable interface, so that Person objects are sorted first by age (ascending order), and then by name (alphabetical order). Test your implementation by creating a list of Person objects and sorting them using both the AgeComparator and the Comparable implementation.

import java.util.ArrayList;
import java.util.*;

class person {
  String name;
  int age;

public person(String name,int age){
  this.name=name;
  this.age=age;
}
public String getName(){
  return name=name;
}
public int getAge(){
  return age=age;
}


public int compareTo(Person p){
  if(name>p.name){
  return 1;
  }
  else if(name<p.name){
    return 1;
  }
  else{
    return 0;
  }
}
  public class AgeComparator implements Comparator<Person>{
    public int compare(Person p1,Person p2){
      return int.compare(p1.getAge().p2.getAge());
    }
  }
}

class PersonMain{
 public static void main(String args[]){
   ArrayList<Person>persons=new ArrayList<Person>();
   Scanner sc=new Scanner(System.in);
   for(int i=0;i<2;i++){
     persons.add(new Person(sc.next(),sc.nextInt()));
   }
   Collections.sort(students);
   for(Student st:students){
     System.out.println(st.getId()+""+st.getName()+""+st.getDept()+""+st.getAge());
   }
 } 
}
