//Write a Java program to iterate over the key-value pairs of a Map using the entrySet() method.
import java.util.Map;
import java.util.HashMap;
  
class Iterate
{
    public static void main(String[] arg)
    {
        Map<String,String> hm= new HashMap<String,String>();
      
        
        hm.put("Karnataka", "Banglore");
        hm.put("Tamilnadu", "Channai");
        hm.put("Andhra Pradesh", "Vijayavada");
        hm.put("Kerala", "Kochi");
          
        
        for (Map.Entry<String,String> entry : hm.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
    }
}