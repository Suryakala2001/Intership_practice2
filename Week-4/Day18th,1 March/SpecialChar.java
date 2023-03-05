import java.util.Scanner;
class StringSpecial{
  static void checkSubString(String str1,String subString){
    if(str1.contains(subString)){
      if(subString.contains("@")){
        System.out.println("yes it contains @");
      }
      else{
        System.out.println("not contains @");
      }
    }
  else{
    System.out.println("invalid");
  }
}


public static void main(String args[]){
  checkSubString("Siri.Surya@gmail.com","@gmail");
}
} 
