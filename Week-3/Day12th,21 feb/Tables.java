import java.util.Scanner;
class Tables{
  public static void main(String args[]){
    int n,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value");
    n=sc.nextInt();
    for (int i=1;i<=10;i++){
      System.out.println(n+"*"+i+"="+(n*i));
    }
  }
}