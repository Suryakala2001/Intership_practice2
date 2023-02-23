import java.util.Scanner;
import java.lang.Math;
class ArmstrongNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num,temp,reminder,result=0,n=0;
    System.out.println("Enter a number");
    num=sc.nextInt();
    temp=num;
    while(temp !=0){
      temp=temp/10;
      n++;
    }
    temp = num;
    while(temp !=0){
      reminder = temp % 10;
      result=result+(int)Math.pow(reminder,n);
      temp=temp/10;
    }
    if (result == num)
      System.out.println(num+"is an Armstrong number");
    else
      System.out.println(num+ " is not Armstrong number");
  }
}