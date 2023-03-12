import java.util.Scanner;
class Employee{
  String emp_id;
  String emp_name;
  String emp_address;
 double salary,HRA,DA;
   void read(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter employee id");
    emp_id=sc.next();
    System.out.println("enter employee name");
    emp_name=sc.next();
    System.out.println("enter the basic salary of employee");
    salary=sc.nextInt();
    System.out.println("enter employee address");
    emp_address=sc.next();
    System.out.println("enter HRA");
    HRA=sc.nextDouble();
    System.out.println("enter DA");
    DA=sc.nextDouble();
   
    
  }
   void calculate(){
   double  hra=(HRA/100)*salary;
    System.out.println(hra);
    double da=(DA/100)*salary;
    System.out.println(da);
    double GS=salary+DA+HRA;
     System.out.println(GS);
    double incometax=0.4*salary;
    System.out.println(incometax);
    double netsalary=GS-incometax;
     System.out.println(netsalary);
  }
     void display() {
    System.out.println("employee id" + emp_id);
    System.out.println("employee name" + emp_name);
    System.out.println("employee address" + emp_address);
    System.out.println("employee salary" + salary);
    
  }
}

class ObjectClassEmployeeMain {
  public static void main(String args[]) {
    Employee emp = new Employee();
    emp.read();
    emp.display();
    emp.calculate();
  }
}