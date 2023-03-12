import java.util.StringTokenizer;
class MaximumLengthTokens{
  public static void main(String args[]){
    StringTokenizer s=new StringTokenizer("Welcome to MITK");
    while(s.hasMoreElements()){
     String str=s.nextToken();
      System.out.println(str.length());
    }
  }
}
  
