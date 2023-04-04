import java.util.*;
class ArrayListMain{
  public static void main(String args[]){
    List list=new ArrayList();
    list.add(647);
    list.add(48.76f);
    list.add("346");
    //System.out.println(list);
    //for(Object obj:list){
      //System.out.println(obj);
  //}
    //System.out.println(list.get(1));
    //list.set(1.346);
    //list.remove(1);
    System.out.println(list.indexOf(346));
    System.out.println(list);
    //ArrayList2
    List<Integer> list1=new ArrayList<Integer>();
    list1.addAll(list);
    System.out.println(list1);
  }
}