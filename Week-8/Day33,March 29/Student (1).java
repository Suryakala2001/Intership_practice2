import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Student{
  String name;
  int age;
  Student(String name,int age){
    this.name=name;
    this.age=age;
  }
}

class MapDemo{
  public static void main(String args[]){
  LinkedHashMap<Integer,Student> hm=new LinkedHashMap<Integer,Student>();
  Scanner sc=new Scanner(System.in);
    for(int i=1;i<n;i++){                                                                                                       
    hm.put(i,new Student(sc.next(),sc.nextInt()));
    }
    for(Map.Entry m:hm.entrySet()){
      Student s=(Student)m.getValue();
      System.out.println("key is"+m.getKey()+"value is"+m.getValue());
      System.out.println("values are");
      System.out.println(s.name+" "+s.age);
    }
  }
}