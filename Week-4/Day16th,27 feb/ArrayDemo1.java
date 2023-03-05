import java.util.Scanner;
class ArrayDemo1{
  public static void main(String args[]){
    int a[][]=new int[4][2];
    Scanner sc=new Scanner(System.in);
    for (int i=0;i<4;i++){
      for(int j=0;j<2;j++){
        a[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<4;i++){
      for(int j=0;j<2;j++){
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
  }
}