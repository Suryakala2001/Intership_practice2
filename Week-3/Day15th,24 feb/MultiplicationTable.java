//Multiplication Table: Create an application that generates the multiplication table of a given number. Use a loop to display the table and conditional statements to check if the current number is a multiple of the given number.

import java.util.Scanner;
class MultipicationTable{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int m=0;
    System.out.println("Enter n value");
    int n=sc.nextInt();
    for(int i=1;i<=10;i++){
      m=n*i;
      if(m%n==0)
      System.out.println(n+"*"+i+"="+m);
    }
  }
}