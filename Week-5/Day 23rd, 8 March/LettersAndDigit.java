import java.util.Scanner;

public class SeparateLettersAndDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String S = sc.nextLine();

    StringBuilder letters = new StringBuilder();
    StringBuilder digits = new StringBuilder();

    for (int i = 0; i < S.length(); i++) {
      char ch = S.charAt(i);
      if (chara.isLetter(ch)) {
        letters.append(ch);
      } else if (chara.isDigit(ch)) {
        digits.append(ch);
      }
    }

    System.out.println("Letters: " + letters);
    System.out.println("Digits: " + digits);
  }
}