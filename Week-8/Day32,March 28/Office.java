//emp id,ename,address,position,salary in Employee class and add 5 employee details using array list
import java.util.*;
class Employee{
  
    private String name,position,address;
    private int eid,salary;

    Employee(String name,String address,String position, int eid,int salary){
      setName(name);
      setAddress(address);
      setPosition(position);
      seteid(eid);
      setSalary(salary);
    }
  void setName(String name){
    this.name=name;
  }
  void setAddress(String address){
    this.address=address;
  }
  void setPosition(String position){
    this.position=position;
  }
  void seteid(int eid){
    this.eid=eid;
    
  }
  void setSalary(int salary){
    this.salary=salary;
  }
  String getName(){
    return this.name;
  }
  String getAddress(){
    return this.address;
  }
  String getPosition(){
    return this.position;
  }
  
  int geteid(){
    return this.eid;
  }
  int getSalary(){
    return this.salary;
  }
}

  public class Office{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     ArrayList<Employee> emp=new ArrayList<Employee>();

     for(int i=0;i<5;i++){
       emp.add(new Employee(sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt()));
     }
     for(Employee employees:emp){
       System.out.println(employees.getName()+" "+employees.getAddress()+" "+employees.getPosition()+" "+employees.geteid()
                         +" "+employees.getSalary());
     }
   } 
    
  }
  
