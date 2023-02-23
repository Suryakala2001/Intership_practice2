import java.util.Scanner;
class VowelArray{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length of array");
    int n=sc.nextInt();
    char a[]=new char[n];
    System.out.println("enter the values");
    for(int i=0;i<n;i++){
      a[i]=sc.next().charAt(0);
      
    }
    System.out.println("vowel array values");
    for(int i=0;i<n;i++){
      if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u');
      System.out.println(a[i]);
    }
  }
  
}