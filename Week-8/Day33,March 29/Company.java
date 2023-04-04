import java.util.*;
class Employee{
  
    private String name,department;
    private int eid,age;

    Employee(String name,String department,int eid,int age){
      setName(name);
      setDepartment(department);
      seteid(eid);
      setAge(age);
    }
  void setName(String name){
    this.name=name;
  }
  void setDepartment(String department){
    this.department=department;
  }
  void seteid(int eid){
    this.eid=eid;
    
  }
  void setAge(int age){
    this.age=age;
  }
  String getName(){
    return this.name;
  }
  String getDepartment(){
    return this.department;
  }
  int geteid(){
    return this.eid;
  }
  int getAge(){
    return this.age;
  }
}

  public class Company{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     ArrayList<Employee> emp=new ArrayList<Employee>();

     for(int i=0;i<3;i++){
       emp.add(new Employee(sc.next(),sc.next(),sc.nextInt(),sc.nextInt()));
     }
     for(Employee employees:emp){
       System.out.println(employees.getName()+" "+employees.getDepartment()+" "+employees.geteid()
                         +" "+employees.getAge());
     }
   } 
    
  }
  
