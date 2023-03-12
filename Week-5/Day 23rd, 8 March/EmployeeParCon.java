import java.util.Scanner;
class Employee{
  int eid;
  String name;
  double salary;
  Employee(int id,String n,String sal){
    eid=id;
    name=n;
    salary=sal;
  }
  void grossSalary(double hra,double da){
    double totalSalary=hra+da+salary;
    System.out.println(totalSalary);
  }

  void display(){
    System.out.println(eid+" "+name+" "+salary);
  }
}

public class Employeemain{
  public static void main(String args[]){
    System.out.println("enter employee Details");
    Scanner sc=new Scanner(System.in);
    Employee emp[]=new Employee[2];

    for(int i=0;i<2;i++){
      System.out.println("enter employee"+(i+1)+"details");
      System.out.println("enter id");
      int id =sc.nextInt();
      System.out.println("enter name");
      String name=sc.next();
      System.out.println("enter salary");
      double salary=sc.nextDouble();
      emp[i]=new Employee(id,name,salary);
        
    }
    
    System.out.println("***Employee Details***");
    for(int i=0;i<3;i++){
      emp[i].display();
      System.out.println("enter hra and da details");

      emp[i].grossSalary(sc.nextDouble(),sc.nextDouble());
      
    }
    
  }
}