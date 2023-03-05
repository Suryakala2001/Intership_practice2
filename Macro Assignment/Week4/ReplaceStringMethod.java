import java.util.Scanner;
  class ReplaceStringMethod{
    static void replaceString(String str,String word,String replace){
      System.out.println(str.replace(word,replace));
      
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String str="Welcome to bitlab";
      System.out.println("enter the word you want to replace");
      
      String word=sc.next();
      String replace=sc.next();
    replaceString(str,word,replace);

    }
    }