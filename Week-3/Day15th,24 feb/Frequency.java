import java.util.*;

public class Main

{

public static void main(String[] args)

{

Scanner sc = new Scanner(System.in);
  int[] arr = new int[100];

int[] freq = new int[100];

int size, i, j, count;
System.out.print("Enter size of array: “);

size = sc.nextInt();
  
{

arr[i] = sc.nextInt();
  freq[i] = -1;

}



for(i=0; i<size; i++)

{

count = 1;
  for(j=i+1; j<size; j++)

{
if(arr[i]==arr[j])

{

count++;
  
freq[j] = 0;

}

}
if(freq[i] != 0)

{

freq[i] = count;

}

}
System.out.print(“nFrequency of all elements of array : n”);

for(i=0; i<size; i++)

{

if(freq[i] != 0)

{
System.out.print(arr[i] + ” occurs ” + freq[i] + ” times” + “n”);

}

}

}
}