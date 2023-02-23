import java.util.Scanner;
class ArrayMinNumbers{
  public static void main(String args[]){
    int a[]=new int[5];
    
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the  values");
    for(int i=0;i<5;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("**Array Elements**");
    int minVal=a[0];
    for(int i=0;i<5;i++){
      if(a[i]<minVal){
        minVal=a[i];
      }
    }
    System.out.println("manimum values"+minVal);
  }
} 
    