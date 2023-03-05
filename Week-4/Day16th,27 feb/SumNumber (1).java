import java.util.Scanner;
class SumNumber{
  public static void main(String args[]){
    int arr[][]={{13,34,54},{26,85,87},{12,67,43}};
    int i,j;
    int count=0,sum=0;
    for( i=0;i<3;i++){
    for( j=0;j<3;j++){
      sum=arr[i][j]+sum;
    }
    System.out.println(sum);
    }
  }
}
