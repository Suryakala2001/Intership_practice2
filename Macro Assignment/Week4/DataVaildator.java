import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
class DataVaildator{
  
  public static boolean isValid(String email){
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&-]+)@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
    Pattern pat = Pattern.compile(emailRegex);
    if (email == null)
      return false;
    return pat.matcher(email).matches();
  }

  public static boolean isValidUsername(String name){
    String regex = "^[A-Za-z]\\w{5,29}$";
    Pattern p = Pattern.compile(regex);
    if (name == null) {
      return false;
    }
    Matcher m = p.matcher(name);// Return if the username
    return m.matches();
  }

  public static boolean isValidPassword(String password){
      String regex = "^(?=.[0-9])"+ "(?=.[a-z])(?=.[A-Z])"+ "(?=.[@#$%^&+=])"+ 
        "(?=\\S+$).{8,20}$";
    Pattern p = Pattern.compile(regex);
    if(password == null) {
      return false;
    }
    Matcher m = p.matcher(password);
    return m.matches();
  }  

  public static boolean isValidd(String s){
    Pattern p = Pattern.compile("^\\d{10}$");
    Matcher m = p.matcher(s);
    return (m.matches());
  }
  
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int choice;
    char c='y';
    do{
      System.out.println("enter your choice \n *****\n");
      System.out.println("1. Email Verifier\n2. Username verifier\n3. Password verifier\n4. Mobile Number verifier\n");
      choice=sc.nextInt();
      switch(choice){
        case 1:
            if(isValid("sirisurya13@gmail.com"))
              System.out.println("Yes, it is valid email");
            else
            System.out.println("no its not valid email");
            break;
          
        case 2:
          System.out.println("Username: Geeksforgeeks");
          String str1 = "Geeksforgeeks";
          System.out.println(isValidUsername(str1));
          System.out.println("Username: 1Geeksforgeeks");
          String str3 = "1Geeksforgeeks";
          System.out.println(isValidUsername(str3));
          break;
          
        case 3:
          System.out.println("password: Geeks@portal20 ");
          String str6 = "Geeks@portal20";
          System.out.println(isValidPassword(str6));
          System.out.println("password: Geeks@ portal9 ");
          String str7 = "Geeks@ portal9";
          System.out.println(isValidPassword(str7));
          break;

        case 4:
          String s = "9632018830";
          String s_1 = "5426391";
          if (isValidd(s))
            System.out.println("Valid Number");
          else
            System.out.println("In-Valid Number");
          if (isValidd(s_1))
            System.out.println("Valid Number");
          else
            System.out.println("In-Valid Number");
      }
      System.out.println("do you want to continue?");
      c=sc.next().charAt(0);
    }while(c!='n');
  }
}