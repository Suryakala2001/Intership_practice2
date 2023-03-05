import java.util.Scanner;
class DivisibleBy5{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a[][]={{13,34,54},{26,85,87},{12,67,43}};
    for(int i=0;i<3;i++){
      int count=0;
    for(int j=0;j<3;j++){
      if(a[i][j]%5==0){
       count++;
     }
    }
      System.out.println(count);
  }
 }
}  