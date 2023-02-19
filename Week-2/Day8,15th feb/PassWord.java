import java.util.Scanner;

public class PassWord{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    String passWord,userInput;
    passWord="siri";
    System.out.println("Please enter the password to continue");
    userInput=sc.next();
    System.out.println("Verifyiny Password");
    if(userInput.equals(passWord)){
      System.out.println("Access Granted");
    }else{
      System.out.println("Access Denied");
    }
    
  }
}