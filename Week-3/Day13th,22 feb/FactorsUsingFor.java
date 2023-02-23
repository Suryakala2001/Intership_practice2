import java.util.Scanner;

 class FactorsOfNumberUsingFor {
  public static void main(String[] args) {
		int Number, i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter any number to Find Factors: ");
		Number = sc.nextInt();
		
		for(i = 1; i <= Number; i++) {
			if(Number%i == 0) {
				System.out.println( i);
			}
		}
	}
}
