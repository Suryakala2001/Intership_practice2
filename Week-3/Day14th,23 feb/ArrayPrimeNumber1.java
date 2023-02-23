import java.util.Scanner;
class ArrayPrimeNumber1{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("Enter the  values");
    for(int i=0;i<5;i++){
      a[i]=sc.nextInt();
    }
   
    for(int i=0;i<5;i++){
    int count=0;
   
      for(int j=1;j<a[i];j++){
        if(a[i]%j==0)
          count++;
      }
      if(count==2)
        System.out.println(a[i]);
    }
  }
}  