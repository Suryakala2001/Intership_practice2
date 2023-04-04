import java.util.*;
class Student{
  private String name,branch;
  private int sid,age;

  Student(String name,String branch,int sid,int age ){
    setName(name);
    setBranch(branch);
    setsid(sid);
    setAge(age);
  }
  void setName(String name){
    this.name=name;
  }
  void setBranch(String branch){
    this.branch=branch;
  }
  void setsid(int sid){
    this.sid=sid;
  }
  void setAge(int age){
    this.age=age;
  }
  String getName(){
    return this.name;
    
  }
  String getBranch(){
    return this.branch;
  }
  int getsid(){
    return this.sid;
  }
  int getAge(){
    return this.age;
  }
  
}
public class School{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ArrayList<Student> st=new ArrayList<Student>();
    System.out.println("enter 5 student details");
    for(int i=0;i<5;i++){
      st.add(new Student(sc.next(),sc.next(),sc.nextInt(),sc.nextInt()));
    }
    for(Student Students:st){
      System.out.println(Students.getName()+" "+Students.getBranch()+" "+Students.getsid()+" "+Students.getAge());
    }
  } 
}