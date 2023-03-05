import java.util.Scanner;
class CreateNDisplay{
  static void create(int n,int a[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array element");
    
    
    for (int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
  }
  static void display(int a[]){
    for (int i=0;i<5;i++){
      System.out.println(a[i]);
    }
  }
  public static void main(String args[]){
    int a[]=new int[10];
    create(7,a);
    display(a);
  }
}