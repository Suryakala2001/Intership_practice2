import java.util.Scanner;
class MaxNumber{
  public static void main(String args[]){
    int firstNumber,secondNumber;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter firstNumber");
    firstNumber=sc.nextInt();
    System.out.println("Enter secondNumber");
    secondNumber=sc.nextInt();
    if (firstNumber>secondNumber){
      System.out.println("First number is maximun number");
    }
    else
    {
      System.out.println("Second number is maximun number");
    }
    
                       
  }
}