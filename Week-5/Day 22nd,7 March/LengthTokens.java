import java.util.StringTokenizer;
class LengthToken{
  public static void main(String args[]){
    StringTokenizer s=new StringTokenizer("how are you");
    System.out.println("length of each token");
    while(s.hasMoreElements()){
      System.out.println(s.nextToken().length());
    }
  }
}