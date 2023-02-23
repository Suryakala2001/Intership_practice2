import java.util.Scanner;

class Printnto1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value n : ");
    int n = sc.nextInt();

		System.out.println("Numbers are : " );
		for(int i=0; i<=n; i--) 
		{
			System.out.println(i);
		}
	}
}