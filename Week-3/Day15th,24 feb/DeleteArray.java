import java.util.*;  
class DeleteArray 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Java Program to delete element at end of Array");
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size+1];
        for(int i=0; i<size; i++) {
            System.out.print("Please give value for index "+ i +" : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to delete at end: ");
        arr[size] = sc.nextInt();
        System.out.println("delete element");
        for(int i=0; i<size+1; i++)
        {
            System.out.println(arr[i]);
        }
	}
}