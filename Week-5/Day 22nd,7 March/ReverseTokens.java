import java.util.StringTokenizer;
class ReverseTokens{
  public static void main(String args[]){
    String s="Welcome to MITK";
    StringTokenizer str=new StringTokenizer(s);
    String sReversed="";
    while(str.hasMoreElements()){
      sReversed=str.nextToken()+""+sReversed;
    }
    System.out.println("Original string:" + s);
    System.out.println("Reversed string:" + sReversed);
    }
  }