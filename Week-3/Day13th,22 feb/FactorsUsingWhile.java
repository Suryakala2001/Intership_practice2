import java.util.Scanner;

class FactorsOfNumberUsingWhile {
public static void main(String[] args) {
	int n; 
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter any number to Find Factors: ");
		Number = sc.nextInt();
		i = 1;
		while(i <= Number) {
			if(Number % i == 0) {
				System.out.println( i);
			}
			i++;
		}
	}
}
  