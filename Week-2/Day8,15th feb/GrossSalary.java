import java.util.Scanner;
class GrossSalary{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your salary");
    double basicSalary=sc.nextDouble();
    double DA,HRA,grossSalary;
    if(basicSalary<= 10000){
      DA=basicSalary * 0.8;
      HRA= basicSalary * 0.2;
    }
    else if(basicSalary<= 20000 && basicSalary>10000){
      DA=basicSalary*0.9;
      HRA=basicSalary*0.25;
    }
    else{
      DA=basicSalary*0.95;
      HRA=basicSalary*0.3;
  
   }
    grossSalary = HRA+DA+basicSalary;
    System.out.println("Gross Salary is = "+ grossSalary);
    
   
    
  }
}