import java.util.Scanner;
class StringEncryption{
  static void StringBufferEncrypt(String word,int s){
   
    StringBuffer result=new StringBuffer();
    for(int i=0;i<word.length();i++){
      if(Character.isUpperCase(word.charAt(i))){
        char ch=(char)(((int)word.charAt(i)+s-65)%26+65);
        result.append(ch);
      }
      else{
        char ch=(char)(((int)word.charAt(i)+s-97)%26+97);
        result.append(ch);
      }
    }
    public static void main (String args[]){
      Scanner sc=new Scanner(System.in);
      int s=4;
      System.out.println("word :"+word);
      System.out.println("shift :"+s);
      System.out.println("cipher:"+encrypt(word,s));
    }
  }
}