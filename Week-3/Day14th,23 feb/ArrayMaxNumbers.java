import java.util.Scanner;
class ArrayMaxNumbers{
  public static void main(String args[]){
    int a[]=new int[5];
    int maxVal=0;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the  values");
    for(int i=0;i<5;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("**Array Elements**");
    for(int i=0;i<5;i++){
      if(a[i]>maxVal){
        maxVal=a[i];
      }
    }
    System.out.println("maximum values"+maxVal);
  }
} 
    