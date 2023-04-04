import java.util.ArrayList;
import java.util.*;

class Employee implements Comparable<Employee>{
   String name;
   int salary;
  Student (String name,int salary){
    this.name=name;
    this.salary=salary;
  }
  public int compareTo(Employee em1){
    return name.compareTo(em1.name);
  }
}
class SalaryComparator implements Comparator<Employee>{
  public int compare(Employee emp1.Employee emp2){
    if
  }
}
class EmployeeComparator{
  public static void main(String args[]){
    ArrayList<Employee> employee=new ArrayList<Employee>();
    Scanner sc=new Scaneer(System.in);
    for(int i=0;i<4;i++){
      employee.add(new employee(sc.next(),sc.nextInt()));
    }
    for(Employee em:employee){
      System.out.println(em.name+""+em.salary);
    }
  }
}
  