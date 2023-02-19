import java.util.Scanner;



class MaxNumber{
  public static void main(String args[]){
    int firstNumber,secnodNumber,thirdNumber;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number");
    firstNumber=sc.nextInt();
    System.out.println("enter second number");
    secnodNumber=sc.nextInt();
    
    System.out.println("enter third number");
    secnodNumber=sc.nextInt();
    if((firstNumber>secnodnumber)&&(firstNumber>thirdnumber))
      System.out.println("first number is maximum number");
    else if((secnodNumber>firstNumber)&&(secnodNumber>thirdNumber))
      System.out.println("second number is maximum number");
     else{
       System.out.println("third number is maximum number");
     } 
    }
  }
