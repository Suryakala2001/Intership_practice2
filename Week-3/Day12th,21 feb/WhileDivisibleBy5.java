import java.util.Scanner;
  class WhileDivisibleBy5{
   public static void main(String args[]){
     int n;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
     n=sc.nextInt();
     int i=0;
     while(i<=n){
       if(i%5==0)
         System.out.println(i);
         i++;
     }
     System.out.println("exit");
   } 
  }
