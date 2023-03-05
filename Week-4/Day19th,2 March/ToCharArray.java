import java.util.Scanner;
class TocharArray{
  static void toCharArray(String str){
  
    char str1[]=str.toCharArray();
    for(int i=0;i<str1.length;i++){
      System.out.println(str1[i]+" ");
    }
  }
  public static void main(String args[]){
    toCharArray("Bitlabs");
  }
}