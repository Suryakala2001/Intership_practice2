//Write a Java program to create a HashMap and add key-value pairs to it.

import java.util.Map;
import java.util.HashMap;
public class HashKey{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();   
   map.put(1,"Mango");  
   map.put(2,"Apple");    
   map.put(3,"Banana");   
   map.put(4,"Grapes");   
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}  