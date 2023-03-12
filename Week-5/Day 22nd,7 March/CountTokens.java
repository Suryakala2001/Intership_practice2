// count number of tokens
import java.util.StringTokenizer;
class CountTokens{
  public static void main(String args[]){
  StringTokenzier s=new  StringTokenizer("welcome to bitlabs");
    int count=0;
    while(s.hasMoreTokens()){
      System.out.println(s.nextToken());
      count++;
    }
    System.out.println(count);
  }
}