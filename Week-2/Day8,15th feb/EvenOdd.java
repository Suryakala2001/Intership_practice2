import java.util.Scanner;
  class EvenOdd{
    public static void main(String args[]){
      int number;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      number=sc.nextInt();
      if(number%2==0){
        System.out.println("yes!,Number is even");
      }
      else
      {
        System.out.println("yes!,Number is odd");
      }
    }
  }