import java.util.Scanner;
class CheckSubString{
  static void compareString(String str1,String subString){
    if(str1.contains(subString)){
     System.out.println("valid");
    }else{
      System.out.println("not valid");
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str1,subString;
    System.out.println("enter string1");
    String s1=sc.nextLine();
    System.out.println("enter string2");
    String sub=sc.nextLine();
    checksubString(str1,subString);
  }
}