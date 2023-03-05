import java.util.Scanner;
class ReadAndDisplayUsingReturn{
  static void insert(int n,int a[]){
   Scanner sc=new Scanner(System.in);
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
  }
  static int[] display(int n,int abc[]){
    return abc;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value");
    int n=sc.nextInt();
    int a[] = new int[n];
    insert(n,a);
    int b[]=new display(n,a);
    for(int i=0;i<n;i++){
      System.out.println(b[i]);
    }
  }
}