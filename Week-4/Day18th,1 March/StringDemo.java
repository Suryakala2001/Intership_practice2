import java.util.Scanner;
class StringDemo{
  
static void getCharacter(String str){
  System.out.println(str.charAt(10));
}
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    //int a=sc.nextInt();
    System.out.println("Enter string");
   // sc.nextLine();
    String str1=sc.nextLine();
    getCharacter(str1);
  }
}