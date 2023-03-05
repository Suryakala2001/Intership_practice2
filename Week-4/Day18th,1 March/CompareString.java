import java.util.Scanner;
class CompareString{
  static void compareStrings(String str1,String str2){
    if(str1.equalsIgnoreCase(str2)){
      System.out.println("Strings are equal");
    }else{
      System.out.println("its not equal");
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str1,str2;
    System.out.println("enter the first string");
    str1=sc.nextLine();
    System.out.println("enter the second string");
    str2=sc.nextLine();

    compareStrings(str1,str2);
  }
}