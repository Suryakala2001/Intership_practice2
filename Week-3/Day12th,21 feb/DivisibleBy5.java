import java.util.Scanner;
  class DivisibleBy5{
   public static void main(String args[]){
     int i,n;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
     n=sc.nextInt();
     for(i=0;i<=n;i++){
       if(i%5==0)
         System.out.println(i);
     }
     System.out.println("exit");
   } 
  }
