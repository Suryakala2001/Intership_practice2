import java.util.Scanner;

class Testcase {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Integer number");
    int num1 = sc.nextInt();

    System.out.println("Enter Double number");
    double num2 = sc.nextDouble();

    System.out.println("Enter Boolean number");
    boolean num3 = sc.nextBoolean();

    System.out.println("Enter  Character");
    char ch = sc.next().charAt(0);

    System.out.println("Integer: " + num1);
    System.out.println("Double: " + num2);
    System.out.println("Boolean: " + num3);
    System.out.println("Character: " + ch);

  }
}