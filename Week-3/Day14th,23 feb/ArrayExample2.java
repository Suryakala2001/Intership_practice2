import java.util.Scanner;
class ArrayExample2{
  public static void main(String args[]){
    int arr[]=new int[4];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter values");
    for(int i=0;i<4;i++){
      arr[i]=sc.nextInt();
    }
  }
}