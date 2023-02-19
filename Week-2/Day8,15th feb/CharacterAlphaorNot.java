import java.util.Scanner;

class AlphabetDigitSpecial{
  public static void main(String args[]){
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the character");
      ch=sc.next().charAt(0);

  if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
    System.out.println("character is alphabet");
  } else if(ch >= '0' && ch <= '9'){
    System.out.println("character is digit");
  } else {
    System.out.println("character is special character");
  }
  }
}