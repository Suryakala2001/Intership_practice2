import java.util.Scanner;
class SumOfFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter  two  number values : ");
        int num = scanner.nextInt();
        int lastDigit=0;
        int firstDigit=0;
        int sum=0;
        lastDigit=num%10;
        while(num>0){
          num=num/10;
        }
        firstDigit=num;
        sum=firstDigit+lastDigit;
        System.out.println("The sum of first digit and last digit of : "+sum);
    }
}