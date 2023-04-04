import java.util.*;  
public class LinkedList{  
 public static void main(String args[]){  
  
  LinkedList<String> list=new LinkedList<String>();  
  list.add("Ravi");  
  list.add("Vijay");  
  list.add("Ravi");  
  list.add("Ajay");  
  
  Iterator<String> itr=list.iterator();  
  while(list.hasNext()){  
   System.out.println(list.next());  
  }  
 }  
}  