import java.util.Scanner;
class WhileSumOdd{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n,sum=0;
    System.out.println("Enter the value");
    n=sc.nextInt();
    int i=1;
    while(i<=n){
      i=i+2;
      sum=sum+i;
    }
    System.out.println("The sum of odd number is"+sum);
  }
}