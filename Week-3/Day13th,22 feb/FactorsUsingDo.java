import java.util.Scanner;

 class FactorsOfNumberUsingDoWhile {
 public static void main(String[] args) {
	int Number, i = 1;
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Please Enter any number to Find Factors: ");
	Number = sc.nextInt();
		
		do {
			if(Number%i == 0) {
				System.out.println( i);
			}
			i++;
		} while(i <= Number);
	}
}