//Create a class called "Person" with attributes "name" and "age". Create an ArrayList of Person objects and add 7 people to it. Print the name and age of each person. Find the person with the highest age and print their name and age.
import java.util.*;
class Person{
  String name;
  int age;

  Person(String name,int age)
  {
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
      System.out.println("name:"+person.name
                        +"age:"+person.age);
    }
    int max=0;
    for(Person person:p){
      if(person.age>max){
        max=person.age;
      }
    }
    System.out.println("higest age of persons is");
    for(Person person:p){
      if(person.age==max){
        System.out.println("name:"+person.name+"age:"+person.age);
      }
    }
  }
}