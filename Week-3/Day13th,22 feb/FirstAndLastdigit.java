import java.util.Scanner;
class FirstAndLastdigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number value");
        int number = sc.nextInt();
        int firstDigit = 0;
        int lastDigit = 0;
        
        lastDigit = number % 10;
        System.out.println("Last Digit is: " + lastDigit);        
        while(number != 0)
        {
            firstDigit = number % 10;
            number = number / 10;
        }
        System.out.println("First Digit is: " + firstDigit);
    }
}