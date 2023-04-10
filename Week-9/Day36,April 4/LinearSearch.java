import java.util.Scanner;
class LinearSearch{
  public static void main(String args[]){
    ////int i,n,search,a[];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of elements");
    int n=sc.nextInt();
    int a[]={10,20,30,40};
    System.out.println("Enter value to find");
     int search=sc.nextInt();

    for(int i=0;i<n;i++){
      if(a[i]==search){
        System.out.println("search element found"+a[i]);
        
        
      }
    }
  }
}