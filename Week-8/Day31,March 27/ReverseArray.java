

import java.util.*;
public class ReverseArray {  
    public static void main(String[] args) {  
        List<String> list = new ArrayList<String>();  
        list.add("Mango");  
        list.add("Banana");  
        list.add("Mango");  
        list.add("Apple");  
        System.out.println("Before Reversing");  
        System.out.println(list.toString());  
          
        Collections.reverse(list);  
        System.out.println("After Reversing");  
        System.out.println(list);  
    }  
}  