import java.util.Scanner;
class CountSplitWords{
  static void wordsSplit(String str){
    String words[]=str.split(" ");
    for(int i=0;i<words.length;i++){
      if(words[i].length()==4){
        System.out.println(words[i]);
      }
    }
  }
  public static void main(String args[]){
    wordsSplit("hello how is your Day");
  }
}