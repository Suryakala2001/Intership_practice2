import java.util.Scanner;
class Example1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int count=0;
    System.out.println("Enter no of row");
    int n=sc.nextInt();
    

    int a[][]=new int[n][n];
    System.out.println("Enter elements of array");
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        a[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
       if(a[i][j]!=20 || a[i][j]<10 ){
         if(a[i][j]<1)
         count++;
         //break;
       }
      }
    }
    System.out.println(count);
    //if(count==0)
    //    System.out.print("Yes");
   // else
  // System.out.print("No");
      }
     }
