import java.util.Scanner;
class StringBuffer{
  public static void main(String args[]){
    StringBuffer str=new StringBuffer();
    str.append("surya");
    System.out.println(str);

    StringBuffer str1=new StringBuffer("surya");
    System.out.println(str1);
    str. append("kala");
    System.out.println(str);
      StringBuffer str3=str.reverse();
    System.out.println(str3);
  }
}