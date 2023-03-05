import java.util.Scanner;
class InsertatSpecificPos{
  public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int AddElement=0;
        int n;    //Array Size Declaration
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();    //Array Size Initialization
        
        Integer arr[]=new Integer[n];    //Array Declaration
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)     //Array Initialization
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the elements you want to insert :");
        int ele = sc.nextInt(); 
     
        // Position to insert 
        System.out.println("Enter the position where you want to insert :");
        int pos = sc.nextInt(); 
      
        // Calling the function to insert 
        AddElement(arr, ele, pos); 
        
    }
}  