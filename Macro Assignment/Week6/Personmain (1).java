//Create a class called Person with attributes name and age. Create a subclass called Employee that inherits from Person and adds attributes salary and position. Create two subclasses, Manager and Engineer, that both inherit from Employee. Add an attribute num_reports to Manager and an attribute specialization to Engineer. Create a method in Manager called hire_employee() that increments the num_reports attribute. Create a method in Engineer called solve_problem() that prints out "Problem solved!".

class Person{
  String name;
  int age;
}
class Employee extends Person{
  double salary;
  
}
class Manager extends Employee{
  int num_reports;
  int hire_employee(){
    return num_reports++;
  }
  
}
class Engineer extends Employee{
  String specialization;
  void solve_problem(){
    System.out.println("problem sloved");
  }
  
  
}

public class Personmain{
  public static void main(String args[]){
     Engineer p=new Engineer();
    p.name="Siri";
    p.age=20;
    p.salary=30000;
    //p.num_reports=3;
    p.solve_problem();
    //System.out.println(p.problem sloved);
    
      
    
  }
}