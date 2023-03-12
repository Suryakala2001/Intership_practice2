import java.util.StringTokenizer;
class StringTokenizerDemo{
  public static void main(String args[]){
    StringTokenizer s=new StringTokenizer("welcome to shimoga");
    while(s.hasMoreElements()){
      System.out.println(s.nextToken());
    }
  }
}