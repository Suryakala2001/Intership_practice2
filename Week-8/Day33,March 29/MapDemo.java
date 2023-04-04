import java.util.HashMap;
import java.util.Map;
class MapDemo{
  public static void main(String args[]){
    HashMap<Integer,String> hm=new HashMap<Integer,String>();
    hm.put(100,"surya");
    hm.put(101,"siri");
    hm.put(102,"bhoomi");
    hm.putIfAbsent(103,"hitha");
    hm.putIfAbsent(103,"hitha");
    System.out.println(hm);
     Integer key=103;
     //hm.remove(100);
    //System.out.println(m.getkey(100));
    for(Map.Entry m:hm.entrySet()){
      if(m.getKey()==key){
      System.out.println(m.getValue());
    }
  }
}
}