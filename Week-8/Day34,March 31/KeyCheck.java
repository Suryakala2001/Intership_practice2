//Write a Java program to check if a particular key is present in a Map.
import java.util.HashMap;
import java.util.Map;
 
public class KeyCheck
{
    public static void main(String[] args)
    {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Dog", 1);
        hashMap.put("Cat", 2);
        hashMap.put("Cow", 3);
 
        String KeyToCheck="Cat";
        if(hashMap.containsKey(KeyToCheck)){
        System.out.println(KeyToCheck+"is present in the Map");        
    }
      else{
        System.out.println(KeyToCheck+"is not present in the Map");
      }
    }
}  
