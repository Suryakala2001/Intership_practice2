import java.util.*;
class ArrayListDemo{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    List<String> list=new ArrayList<String>();
    list.add("java");   
    list.add("python");
    list.add("c");
    System.out.println(list);
    for(String i:list)
      {
        System.out.println(i);
      }
      
  }
}