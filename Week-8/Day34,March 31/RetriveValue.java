//Write a Java program to retrieve a value from a Map using its key.
import java.util.HashMap;
import java.util.Map;

public class RetriveValue {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        hm.put("siri", 10);
        hm.put("surya", 20);
        hm.put("bhoomi", 30);

        String key = "surya";
        Integer value = hm.get(key);

        if (value != null) {
            System.out.println("The value for key " + key + " is " + value);
        } else {
            System.out.println("The key " + key + " is not present in the map.");
        }
    }
}