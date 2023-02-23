import java.util.Scanner;
class SumofOddnumber{
  public static void main(String args[]){
    int n,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n values");
    n=sc.nextInt();
    for(int i=1;i<=n;i=i+2){
      sum=sum+i;
    }
    System.out.println("The sum of odd number is"+sum);
  }
}