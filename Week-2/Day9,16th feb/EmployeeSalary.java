
    // Employee Salary Calculator: Create an application that takes an employee's salary and calculates their annual salary, tax and net salary. Use conditional statements to determine the tax bracket and calculate the tax accordingly.

    import java.util.Scanner;
    class EmployeeSalary{
    public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    double salary,annual_Salary,net_Salary;
    double tax=0;
    System.out.println("Enter your Salary");
    salary=sc.nextDouble();
    annual_Salary=salary*12;
    System.out.println("Your annual Salary"+annual_Salary);
    if (annual_Salary<300000){
    System.out.println("no gst tax");
    }
    else if(annual_Salary>=300000 && annual_Salary<=600000){
      System.out.println("pay 5% of income");
      tax=annual_Salary*0.05;
    }else if(annual_Salary>=600000 && annual_Salary<=900000){
      System.out.println("pay 10% of income");
      tax=annual_Salary*0.10;
      }else if(annual_Salary>=900000 && annual_Salary<=120000){
      System.out.println("pay 15% of income");
      tax=annual_Salary*0.15;
      }else if(annual_Salary>=120000 && annual_Salary<=1500000){
      System.out.println("pay 20% of income");
      tax=annual_Salary*0.20;
    }else{
      System.out.println("You have to pay 30% of income");
      tax=annual_Salary*0.30;
    }
    System.out.println("your tax is: "+tax);
    net_Salary=annual_Salary-tax;
    System.out.println("your net Salary"+net_Salary);
 }
}
    
    
    
    
  

