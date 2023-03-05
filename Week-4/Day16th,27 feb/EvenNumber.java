import java.util.Scanner;
class EvenNumber{
  public static void main(String args[]){
     int arr[][]={{13,34,54},{26,85,87},{12,67,43}};
    int i,j;
    int count=0;
    for ( i=0;i<3;i++){
    for ( j=0;j<3;j++){
      if(arr[i][j]%2==0){
       count++;
    }
    System.out.println(count);
    }
      
  }
}
}