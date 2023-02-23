import java.util.Scanner;
class ArrayPrime{
  public static void main(String args[]){
    int a[]=new int[5];
    boolean isPrime=true;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the  values");
    for(int i=0;i<5;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("**Array Elements**");
    for(int i=0;i<5;i++){
     
      for(int j=2;j*j<a[i];j++){
        if(a[i]%j ==0){
          isPrime=false;
          break;
        }
      }
      if(isPrime){
        System.out.println("the prime number"+a[i]);
      }
    }  
  }  
}      
      