import java.util.Scanner;
class ArrayDemo{
  public static void main(String args[]){
    int a[]=new int[4];
    int n=4;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the array elements");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
  }

  static void insert(int newElement,int a[],int n){
    Scanner sc=new Scanner(System.in);
    newElement=sc.nextInt();
    for(int i=n-1;i>=0;i--){
      a[i+1]=a[i];
    }
    a[0]=newElement;
    n=n++;
  }
    
}