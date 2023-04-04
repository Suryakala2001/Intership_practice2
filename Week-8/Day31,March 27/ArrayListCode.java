import java.util.*;
class ArrayListCode{
  public static void main(String args[]){
   // List<Integer> list=new ArrayList<Integer>();
    //Scanner sc=new Scanner(System.in);
    //for(int i=0;i<3;i++){
      //list.add(sc.nextInt());
    //}
    //for(Integer num:list){
      //if(num%2==0){
        //System.out.println(num);
      //}
    //}
    List<String> animal=new ArrayList<String>();
    animal.add("cat");
    animal.add("dog");
    animal.add("cow");
    int count=0,index=0;
    for(String st:animal){
      if(st.equals("cat")){
        count++;
        index=animal.indexOf("cat");
        break;
      }
    }
    if(count==1){
        System.out.println("found at position"+index);
      }
      else{
        System.out.println("not found");
      }
    }
  }
