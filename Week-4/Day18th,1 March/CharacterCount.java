import java.util.Scanner;
class CharacterCount{
  static void characterCount(String str){
    char ch[]=str.toCharArray();
    int acount=0,dcount=0,scount=0;
    for(int i=0;i<=ch.length;i++){
      if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i] 
        <='Z')){
        acount++;
      }
      else if(ch[i]>='0'&&ch[i]<='3'){
        dcount++;
        }
      else{
        scount++;
      }
    }
    System.out.println("alphabet"+acount);
    System.out.println("digit"+dcount);
    System.out.println("special character"+scount);
  }
  public static void main(String args[]){
    characterCount("Suryakala@13");
  }
}