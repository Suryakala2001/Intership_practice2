import java.util.Scanner;
class CharacterCount{
  static void characterCount(String str){
    char ch[]=str.toCharArray();
    int acount=0,dcount=0,scount=0;
    for(int i=0;i<=ch.length;i++){
      if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i] 
        <='Z')){
        alpha=alpha+ch[i];
      }
      else if(ch[i]>='0'&&ch[i]<='9'){
        digit=digit+ch[i];
        }
    }
    String newString=alpha+digit;
    System.out.println(newString);
  }
  public static void main(String args[]){
    characterCount("a1b2c3");
    
   
    
  }
}