import java.util.Scanner;
class Grade2{
  public static void main(String args[]){
    double phy,chem,maths,bio,comp,percentage;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks of five subjects");
    phy=sc.nextDouble();
    chem=sc.nextDouble();
    maths=sc.nextDouble();
    bio=sc.nextDouble();
    comp=sc.nextDouble();
    percentage=((phy+chem+maths+bio+comp)/500)*100;
    System.out.println(percentage);
    if(percentage >= 90){
      System.out.println("grade A");
    }
    else if((percentage >= 80) && (percentage < 90)){
      System.out.println("grade B");
    }
    else if((percentage >= 70) && (percentage < 80)){
      System.out.println("grade C");
    }
    else if((percentage >= 60) && (percentage < 70)){
      System.out.println("grade D");
    }
    else if((percentage >= 40) && (percentage < 60)){
      System.out.println("grade E");
    }
    else{
      System.out.println("graden F");
    }
  }
}