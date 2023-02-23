import java.util.Scanner;
class ArraySumofEven{
  public static void main(String args[]){
    int a[]=new int[3];
    int evenSum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the values");
    for(int i=0;i<3;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("*Array Element");
    for(int i=0;i<3;i++){
      if(a[i]%2==0){
        evenSum=evenSum+a[i];
      }
      
    }
    System.out.println("Sum of Even number"+evenSum);
  }
}