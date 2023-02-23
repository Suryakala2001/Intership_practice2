import java.util.Scanner;
class FibonacciSeries{
  public static void main(String[] args) {

    int n =17 ,firstTerm = 0, secondTerm = 1;
    System.out.println(" Enter a Fibonacci Series ");
    n=sc.nextInt();

    for (int i = 1; i <= n; ++i) {
      System.out.println("firstTerm ");

      
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}