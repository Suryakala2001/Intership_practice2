import java.util.*;

public class StringFormatMethod {
  public static void main(String args[]) {
    double n1 = 23.5634, n2 = 345.67;
    double result = n1 * n2;
    // System.out.println(result); || || || || method to display table format
    String result1 = String.format(" - %12.2f - %12.2f - %12.2f", result, result, result);
    System.out.println(result1);
    String result2 = String.format(" - %12.2f - %12.2f - %12.2f", result, result, result);
    System.out.println(result2);
  }
}