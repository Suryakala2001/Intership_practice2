import java.util.Scanner;
import java.time.LocalDate; // for current date
import java.time.format.DateTimeFormatter; // date format
import java.time.Period;
class PersonAgeCalculation{
  String name;
  char gender;
  int age;
  String dob;
  void display(){
    System.out.println("the name of person is "+name);
    System.out.println("the age of "+name+" is "+age);
    System.out.println("the gender of "+name+" is "+gender);
    System.out.println("\n\n");
  }
  void calculateYearOfBirth(){
    Scanner sc=new Scanner(System.in);
    int curYear=2023;
    System.out.println("current year"+curYear);
    int ageUsingYear=curYear-age;
    System.out.println("the person was born in year"+ageUsingYear);
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    person p[]=new Person[4];
    for(int i=0;i<4;i++){
    p[i]=new Person();
      System.out.println("enter the name of person");
      p[i].name=sc.next();
      System.out.println("enter the age of the person");
      p[i].gender=sc.next().charAt(0);
      p[i].display();
      p[i].calculateYearOfBirth();
    }
  }
  
  }  
